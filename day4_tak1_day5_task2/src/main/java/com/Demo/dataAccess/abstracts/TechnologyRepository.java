package com.Demo.dataAccess.abstracts;


import com.Demo.entities.concretes.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<LanguageTechnology, Integer> {
	LanguageTechnology findById(int id);
}
