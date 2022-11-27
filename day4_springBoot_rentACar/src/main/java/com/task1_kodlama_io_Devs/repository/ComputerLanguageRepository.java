package com.task1_kodlama_io_Devs.repository;

import com.task1_kodlama_io_Devs.entity.concretes.ProgrammingLanguage;

import java.util.List;

public interface ComputerLanguageRepository {


    List<ProgrammingLanguage> listAll();

    ProgrammingLanguage findById(Long id);

    void deleteById(Long id);

    void save(ProgrammingLanguage computerLanguages);

    void update(ProgrammingLanguage computerLanguages);

}
