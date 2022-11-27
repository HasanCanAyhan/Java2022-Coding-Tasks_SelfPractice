package com.Demo.dataAccess.abstracts;


import com.Demo.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
	ProgrammingLanguage findById(int id);
}
