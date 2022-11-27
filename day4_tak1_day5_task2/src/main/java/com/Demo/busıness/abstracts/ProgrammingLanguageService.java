package com.Demo.busıness.abstracts;




import java.util.List;

import com.Demo.busıness.requests.programmingLanguages.CreateLanguageRequest;
import com.Demo.busıness.requests.programmingLanguages.UpdateLanguageRequest;
import com.Demo.busıness.responses.GetAllLanguagesResponse;
import com.Demo.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	List<GetAllLanguagesResponse> getAll();

	
	void delete(int id);
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception;
	
	ProgrammingLanguage getById(int id);
	

}
