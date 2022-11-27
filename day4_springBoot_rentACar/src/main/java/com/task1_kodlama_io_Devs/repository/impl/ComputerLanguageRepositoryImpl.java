package com.task1_kodlama_io_Devs.repository.impl;

import com.task1_kodlama_io_Devs.entity.concretes.ProgrammingLanguage;
import com.task1_kodlama_io_Devs.repository.ComputerLanguageRepository;

import java.util.*;

public class ComputerLanguageRepositoryImpl implements ComputerLanguageRepository {


    List<ProgrammingLanguage> computerLanguagesList;

    public ComputerLanguageRepositoryImpl() {
        computerLanguagesList = new ArrayList<>();
        computerLanguagesList.add(new ProgrammingLanguage(1L,"Java"));
        computerLanguagesList.add(new ProgrammingLanguage(2L,"Python"));
        computerLanguagesList.add(new ProgrammingLanguage(3L,"C#"));

    }


    @Override
    public List<ProgrammingLanguage> listAll() {
        return computerLanguagesList;
    }

    @Override
    public ProgrammingLanguage findById(Long id) {
        return computerLanguagesList.get(id.intValue() -1);
    }

    @Override
    public void deleteById(Long id) {
        computerLanguagesList.remove(id.intValue() -1);
    }

    @Override
    public void save(ProgrammingLanguage computerLanguages) {
        computerLanguagesList.add(computerLanguages);
    }

    @Override
    public void update(ProgrammingLanguage computerLanguages) {

        ProgrammingLanguage updatingCL = findById(computerLanguages.getId());
        updatingCL.setName(computerLanguages.getName());

    }


}
