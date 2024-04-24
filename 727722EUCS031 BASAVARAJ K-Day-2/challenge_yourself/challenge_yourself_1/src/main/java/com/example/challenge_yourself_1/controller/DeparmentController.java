package com.example.challenge_yourself_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.challenge_yourself_1.model.Department;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DeparmentController {

     @GetMapping("/student")
     public Department getMethodName() {
          Department d = new Department("Information technology-B", "IT");
          return d;
     }

}
