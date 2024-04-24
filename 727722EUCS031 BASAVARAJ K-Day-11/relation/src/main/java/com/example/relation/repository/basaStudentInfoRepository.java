package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.basaStudentInfo;

@Repository
public interface basaStudentInfoRepository extends JpaRepository<basaStudentInfo,Integer>{
    
}