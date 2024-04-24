package com.example.class_exercise_1.basaservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Basamodel.BasaMedicine;
import com.example.class_exercise_1.basarepository.BasaMedicineRepository;

@Service
public class basaMedicineService {

     @Autowired
     BasaMedicineRepository medicineRepository;

     public List<BasaMedicine> getAllMedicines() {
          // List<Medicine> list ;
          return medicineRepository.findAll();
     }

     public BasaMedicine addMedicine(BasaMedicine medicine) {
          return medicineRepository.save(medicine);
     }

     public Optional<BasaMedicine> getRequiredMedicin(int medicineId) {
          return medicineRepository.findById(medicineId);
     }

}
