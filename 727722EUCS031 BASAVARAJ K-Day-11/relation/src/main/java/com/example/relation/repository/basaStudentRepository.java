package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.basaStudent;

@Repository
public interface basaStudentRepository extends JpaRepository<basaStudent,Integer>{
    
}
