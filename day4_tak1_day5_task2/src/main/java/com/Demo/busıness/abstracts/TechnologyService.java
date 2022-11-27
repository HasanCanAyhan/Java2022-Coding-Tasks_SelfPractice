package com.Demo.busıness.abstracts;


import com.Demo.busıness.requests.technologies.CreateTechnologyRequest;
import com.Demo.busıness.requests.technologies.UpdateTechnologyRequest;
import com.Demo.busıness.responses.GetAllTechnologyResponses;
import com.Demo.entities.concretes.LanguageTechnology;

import java.util.List;

public interface TechnologyService {
       List<GetAllTechnologyResponses> getAll();
       void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
       void delete(int id);
	LanguageTechnology getById(int id);
	void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception;
	
}
