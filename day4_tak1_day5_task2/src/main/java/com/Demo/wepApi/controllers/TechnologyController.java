package com.Demo.wepApi.controllers;

import java.util.List;

import com.Demo.busıness.abstracts.TechnologyService;
import com.Demo.busıness.requests.technologies.CreateTechnologyRequest;
import com.Demo.busıness.requests.technologies.UpdateTechnologyRequest;
import com.Demo.busıness.responses.GetAllTechnologyResponses;
import com.Demo.entities.concretes.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/languageTechnologies")
public class TechnologyController {
	private TechnologyService technologyService;
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService=technologyService;
	}
	@GetMapping("/getall")
	public List<GetAllTechnologyResponses> getAll(){
		return technologyService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody() CreateTechnologyRequest createTechnologyRequest) throws Exception{
		this.technologyService.add(createTechnologyRequest);
	}
	 @DeleteMapping("/delete")
     public void delete(@RequestBody() int id) {
    	 this.technologyService.delete( id);
     }
	 @GetMapping("/getById")
     public LanguageTechnology getById(int id) {
    	 
    	 return technologyService.getById(id);
  
     }
	 @PutMapping("/update/{id}")
     public void update(@RequestBody() UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
    	 this.technologyService.update(updateTechnologyRequest, id);
     }
     

}
