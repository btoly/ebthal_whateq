package com.example.Whathg_Database.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Language;



@Repository
@Transactional
public interface LanguageRepository extends CrudRepository<Language, Integer>{

}

