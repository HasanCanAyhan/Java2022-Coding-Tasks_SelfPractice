package com.Demo.busıness.concretes;



import java.util.ArrayList;
import java.util.List;

import com.Demo.busıness.abstracts.TechnologyService;
import com.Demo.busıness.requests.technologies.CreateTechnologyRequest;
import com.Demo.busıness.requests.technologies.UpdateTechnologyRequest;
import com.Demo.busıness.responses.GetAllTechnologyResponses;
import com.Demo.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.Demo.dataAccess.abstracts.TechnologyRepository;
import com.Demo.entities.concretes.LanguageTechnology;
import com.Demo.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class TechnologyManager implements TechnologyService {
      private TechnologyRepository technologyRepository;
      private ProgrammingLanguageRepository programmingLanguageRepository;
      
      boolean isExist=false;
	
    @Autowired
	public TechnologyManager(TechnologyRepository technologyRepository,ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllTechnologyResponses> getAll() {
		List<LanguageTechnology> languageTechnologies=technologyRepository.findAll();
		List<GetAllTechnologyResponses> technologyResponse=new ArrayList<GetAllTechnologyResponses>();
		
		for(LanguageTechnology languageTechnology:languageTechnologies) {
			GetAllTechnologyResponses  responseItem=new GetAllTechnologyResponses();
			 responseItem.setId(languageTechnology.getId());
			 responseItem.setTechnology(languageTechnology.getTechnologyName());
			 responseItem.setProgrammingLanguage(languageTechnology.getProgrammingLanguage().getLanguage());
			 technologyResponse.add(responseItem);
	}
	return technologyResponse;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		LanguageTechnology technology=new LanguageTechnology();
		technology.setTechnologyName(createTechnologyRequest.getTechnology());
		
		if(technology.getTechnologyName()==null || createTechnologyRequest.getTechnology().isEmpty()) {
			throw new Exception ("this area cannot be blank");
		}
		else if(isTechnologyExist(technology)) {
		throw new Exception	("this language technology is in list already.");
		}
		else {
			ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(createTechnologyRequest.getMainLanguageId());
			technology.setProgrammingLanguage(programmingLanguage);
			technologyRepository.save(technology);
			throw new Exception("technology information is added.");
		}
		
	}

	public boolean isTechnologyExist(LanguageTechnology languageTechnology) throws Exception{
        for(GetAllTechnologyResponses language : getAll()) {
            if(language.getTechnology().equals(languageTechnology.getTechnologyName())) {
                isExist = true;
            }
        }
        return isExist;
    }
		
    @Override
	public void delete(int id) {
		this.technologyRepository.deleteById(id);
		
	}
	@Override
	public LanguageTechnology getById(int id) {
		return technologyRepository.findById(id);
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
		LanguageTechnology languageTechnology=technologyRepository.findById(id);
		
			if(languageTechnology.getTechnologyName().equalsIgnoreCase(updateTechnologyRequest.getName())) {
				throw new Exception("this language technology in list already.");
			}
			else {
				languageTechnology.setTechnologyName(updateTechnologyRequest.getName());
				this.technologyRepository.save(languageTechnology);
			}
			
		}

	
	}
	


