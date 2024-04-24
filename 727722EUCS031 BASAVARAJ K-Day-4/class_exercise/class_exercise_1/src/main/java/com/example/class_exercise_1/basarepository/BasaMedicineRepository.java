package com.example.class_exercise_1.basarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_1.Basamodel.BasaMedicine;

/**
 * MedicineRepository
 */
@Repository
public interface BasaMedicineRepository extends JpaRepository<BasaMedicine, Integer> {

}
