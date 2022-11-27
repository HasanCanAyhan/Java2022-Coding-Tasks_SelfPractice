package com.rentACar.webApi.controllers;


import com.rentACar.business.abstracts.BrandService;
import com.rentACar.business.requests.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private final BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall") //api/brands/getall
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }


    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        brandService.add(createBrandRequest);
        brandService.getAll();
    }

}
