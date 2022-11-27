package com.Demo.busıness.concretes;


import java.util.ArrayList;
import java.util.List;

import com.Demo.busıness.abstracts.ProgrammingLanguageService;
import com.Demo.busıness.requests.programmingLanguages.CreateLanguageRequest;
import com.Demo.busıness.requests.programmingLanguages.UpdateLanguageRequest;
import com.Demo.busıness.responses.GetAllLanguagesResponse;
import com.Demo.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.Demo.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	boolean isExist = false;
	
	 @Autowired
		public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
			super();
			this.programmingLanguageRepository = programmingLanguageRepository;
		}
	
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages= programmingLanguageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse=new ArrayList<GetAllLanguagesResponse>();
		
		 for(ProgrammingLanguage programmingLanguage: programmingLanguages) {
			 GetAllLanguagesResponse  responseItem=new GetAllLanguagesResponse();
			 responseItem.setId(programmingLanguage.getId());
			 responseItem.setName(programmingLanguage.getLanguage());
			 languagesResponse.add(responseItem);
	}
	return languagesResponse;
	
	}
	
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setLanguage(createLanguageRequest.getName());
		
		if(language.getLanguage()==null || createLanguageRequest.getName().isEmpty()) {
			throw new Exception("this area cannot be blank");
		}
		else if(isLanguageExist(createLanguageRequest.getName())==true) {
			throw new Exception("this programming language is in list already.");
	}
		else {
			this.programmingLanguageRepository.save(language);
			throw new Exception("programming language information is added.");
		}
	}
	
	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.findById(id);
	}

	@Override
	public void delete(int id) {
		this.programmingLanguageRepository.deleteById(id);;
		
	}
	
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
		
		if(programmingLanguage.getLanguage().equalsIgnoreCase(updateLanguageRequest.getName())) {
			throw new Exception("this language in list already.");
		}
		else {
			programmingLanguage.setLanguage(updateLanguageRequest.getName());
			this.programmingLanguageRepository.save(programmingLanguage);
		}
		
	}
	
	
	public boolean isLanguageExist(String programmingLanguage) throws Exception{
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		
		for(ProgrammingLanguage language : programmingLanguages) {
			if(language.getLanguage().equalsIgnoreCase(programmingLanguage)) {
				isExist = true;
			}
		}
		
		return isExist;
	}
	
}