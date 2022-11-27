package com.Demo.wepApi.controllers;

import java.util.List;

import com.Demo.busıness.abstracts.ProgrammingLanguageService;
import com.Demo.busıness.requests.programmingLanguages.CreateLanguageRequest;
import com.Demo.busıness.requests.programmingLanguages.UpdateLanguageRequest;
import com.Demo.busıness.responses.GetAllLanguagesResponse;
import com.Demo.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;
    
	@Autowired 
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateLanguageRequest createLanguageRequest) throws Exception{
		this.programmingLanguageService.add(createLanguageRequest);
     }
	
     @DeleteMapping("/delete")
     public void delete(@RequestBody() int id) {
    	 this.programmingLanguageService.delete(id);
     }
     
     @GetMapping("/getById")
     public ProgrammingLanguage getById(int id) {
    	 
    	 return programmingLanguageService.getById(id);
  
     }
     
     @PutMapping("/update/{id}")
     public void update(@RequestBody() UpdateLanguageRequest updateLanguageRequest, int id) throws Exception {
    	 this.programmingLanguageService.update(updateLanguageRequest, id);
     }
     
}
