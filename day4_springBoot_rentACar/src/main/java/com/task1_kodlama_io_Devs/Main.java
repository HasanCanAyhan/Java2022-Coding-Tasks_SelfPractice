package com.task1_kodlama_io_Devs;

import com.task1_kodlama_io_Devs.entity.concretes.ProgrammingLanguage;
import com.task1_kodlama_io_Devs.repository.impl.ComputerLanguageRepositoryImpl;
import com.task1_kodlama_io_Devs.service.ComputerLanguageService;
import com.task1_kodlama_io_Devs.service.impl.ComputerLanguageServiceImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        ProgrammingLanguage computerLanguages = new ProgrammingLanguage(4L,"SQL");

        ComputerLanguageService computerLanguageService = new ComputerLanguageServiceImpl(new ComputerLanguageRepositoryImpl());
        computerLanguageService.save(computerLanguages);


        for (ProgrammingLanguage languages : computerLanguageService.listAll()) {
            System.out.println(languages.getName());
        }

        System.out.println( computerLanguageService.findById(4l).getName() );






    }

}
