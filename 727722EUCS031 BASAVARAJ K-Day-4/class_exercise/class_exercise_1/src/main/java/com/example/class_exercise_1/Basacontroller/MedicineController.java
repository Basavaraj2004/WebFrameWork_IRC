package com.example.class_exercise_1.Basacontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.Basamodel.BasaMedicine;
import com.example.class_exercise_1.basaservice.basaMedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MedicineController {

     @Autowired
     public basaMedicineService medicineService;

     @GetMapping("/api/medicines")
     public ResponseEntity<List<BasaMedicine>> getMethodName() {

          List<BasaMedicine> medicines = medicineService.getAllMedicines();
          if (medicines.isEmpty()) {
               return new ResponseEntity<>(medicines, HttpStatus.NOT_FOUND);

          } else {

               return new ResponseEntity<>(medicines, HttpStatus.CREATED);
          }
     }

     @PostMapping("/api/medicine")
     public ResponseEntity<BasaMedicine> postMethodName(@RequestBody BasaMedicine medicine) {

          BasaMedicine tablet = medicineService.addMedicine(medicine);
          return new ResponseEntity<>(tablet, HttpStatus.OK);
     }

     @GetMapping("/api/medicine/{medicineId}")
     public ResponseEntity<Optional<BasaMedicine>> SearchMedicine(@PathVariable int medicineId) {
          Optional<BasaMedicine> search = medicineService.getRequiredMedicin(medicineId);
          if (search.isPresent()) {

               return new ResponseEntity<>(search, HttpStatus.OK);
          } else {
               return new ResponseEntity<>(search, HttpStatus.NOT_FOUND);
          }

     }

}
