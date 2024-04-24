package com.example.day6cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6cy.model.BasaEmployee;

public interface BasaEmployeeRepo extends JpaRepository<BasaEmployee,Integer>{
    
}
