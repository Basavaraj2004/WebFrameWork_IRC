package com.example.day5cw2.Basarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.model.BasaEmployee;


@Repository
public interface EmployeeRepo extends JpaRepository<BasaEmployee,Integer>{
    
}
