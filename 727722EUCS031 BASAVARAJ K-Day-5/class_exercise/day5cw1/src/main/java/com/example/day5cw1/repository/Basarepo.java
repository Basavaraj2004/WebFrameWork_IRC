package com.example.day5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.model.Basamodel;

@Repository
public interface Basarepo extends JpaRepository<Basamodel,Integer>{
    
}
