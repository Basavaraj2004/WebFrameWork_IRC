package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.BasaStudent;
import com.example.class_exercise_2.service.BasaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BasaStudentController {

     @Autowired
     public BasaStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<BasaStudent>> getDetails() {
          List<BasaStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<BasaStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<BasaStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<BasaStudent> postMethodName(@RequestBody BasaStudent student) {

          BasaStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<BasaStudent>> sortedDetails(@PathVariable String field) {
          List<BasaStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<BasaStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<BasaStudent>>(list, HttpStatus.OK);

     }
}
