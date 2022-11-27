package com.rentACar.business.abstracts;

import com.rentACar.business.requests.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {

    //business logic

    List<GetAllBrandsResponse> getAll();//responses : answer to user from ui-part : DTO

    void add(CreateBrandRequest createBrandRequest);


}
