package com.task1_kodlama_io_Devs.service.impl;

import com.task1_kodlama_io_Devs.entity.concretes.ProgrammingLanguage;
import com.task1_kodlama_io_Devs.repository.ComputerLanguageRepository;
import com.task1_kodlama_io_Devs.service.ComputerLanguageService;
import java.util.List;

public class ComputerLanguageServiceImpl implements ComputerLanguageService {


    private final ComputerLanguageRepository computerLanguageRepository;

    public ComputerLanguageServiceImpl(ComputerLanguageRepository computerLanguageRepository) {
        this.computerLanguageRepository = computerLanguageRepository;
    }

    @Override
    public void save(ProgrammingLanguage computerLanguages) throws Exception {

        if (computerLanguages.getId() == 0 || computerLanguages.getName() == null){
            throw new Exception("Name can not be null!");
        }

        for (ProgrammingLanguage languages : computerLanguageRepository.listAll()) {

            if (languages.getName().equals(computerLanguages.getName())){
                throw new Exception("Name can not be same!");
            }

        }

        computerLanguageRepository.save(computerLanguages);
    }

    @Override
    public void delete(Long id) {
        computerLanguageRepository.deleteById(id);
    }

    @Override
    public void update(ProgrammingLanguage computerLanguages) {
        computerLanguageRepository.update(computerLanguages);
    }

    @Override
    public List<ProgrammingLanguage> listAll() {
        return computerLanguageRepository.listAll();
    }

    @Override
    public ProgrammingLanguage findById(Long id) {
        return computerLanguageRepository.findById(id);
    }
}
