package com.example.day6pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.model.BasaLanguage;

@Repository
public interface BasaLanguageRepo extends JpaRepository<BasaLanguage,Integer>{
    
}
