package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.basaStudent;
import com.example.relation.repository.basaStudentRepository;

@Service
public class basaStudentService {
    public basaStudentRepository studentRepository;
    public basaStudentService(basaStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public basaStudent saveStudent(basaStudent student)
    {
        return studentRepository.save(student);
    }
    public List<basaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
