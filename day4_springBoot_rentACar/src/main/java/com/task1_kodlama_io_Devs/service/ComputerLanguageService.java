package com.task1_kodlama_io_Devs.service;

import com.task1_kodlama_io_Devs.entity.concretes.ProgrammingLanguage;

import java.util.List;

public interface ComputerLanguageService {

    void save(ProgrammingLanguage computerLanguages) throws Exception;
    void delete(Long id );
    void update(ProgrammingLanguage computerLanguages );
    List<ProgrammingLanguage> listAll();
    ProgrammingLanguage findById(Long id);

}
