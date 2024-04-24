package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.basaStudent;
import com.example.relation.service.basaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class SbasatudentController {
    public basaStudentService studentService;
    public SbasatudentController(basaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public basaStudent postMethodName(@RequestBody basaStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<basaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
