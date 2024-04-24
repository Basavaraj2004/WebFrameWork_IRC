package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.basaStudent;
import com.example.bidirection.model.basaStudentInfo;
import com.example.bidirection.repository.basaStudentInfoRepository;
import com.example.bidirection.repository.SbasatudentRepository;

@Service
public class basaStudentService {
    public SbasatudentRepository studentRepository;
    public basaStudentInfoRepository studentInfoRepository;
    public basaStudentService(SbasatudentRepository studentRepository,basaStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public basaStudent saveStudent(basaStudent student)
    {
        return studentRepository.save(student);
    }
    public basaStudentInfo saveStudentInfo(basaStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<basaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
