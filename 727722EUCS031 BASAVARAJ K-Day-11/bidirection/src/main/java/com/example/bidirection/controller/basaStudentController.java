package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.basaStudent;
import com.example.bidirection.model.basaStudentInfo;
import com.example.bidirection.service.basaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class basaStudentController {
    public basaStudentService studentService;
    public basaStudentController(basaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public basaStudent postMethodName(@RequestBody basaStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public basaStudentInfo postMethodName(@RequestBody basaStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<basaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}