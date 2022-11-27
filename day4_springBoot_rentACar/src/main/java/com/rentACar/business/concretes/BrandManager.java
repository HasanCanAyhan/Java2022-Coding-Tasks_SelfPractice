package com.rentACar.business.concretes;

import com.rentACar.business.abstracts.BrandService;
import com.rentACar.business.requests.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.dataAccess.abstracts.BrandRepository;
import com.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
           //BrandServiceImpl

    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll(); // it is coming from DB : entity
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }

        return brandsResponse;


    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) { //save to DB
        //return brand entity                 this is dto

        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }


}
