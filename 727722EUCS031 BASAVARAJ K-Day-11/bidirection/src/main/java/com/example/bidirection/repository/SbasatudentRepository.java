package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.basaStudent;



@Repository
public interface SbasatudentRepository extends JpaRepository<basaStudent,Integer>{
    
}
