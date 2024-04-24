package com.priyanshu.q_04.Basarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanshu.q_04.Basamodel.BasaPatient;

public interface BasaPatientRepo extends JpaRepository<BasaPatient, Integer> {

}