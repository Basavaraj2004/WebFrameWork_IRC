package com.priyanshu.q_04.Basaservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.q_04.Basamodel.BasaPatient;
import com.priyanshu.q_04.Basarepository.BasaPatientRepo;

@Service
public class PatientService {

    @Autowired
    private BasaPatientRepo patientRepo;

    public List<BasaPatient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Optional<BasaPatient> getPatientById(int id) {
        return patientRepo.findById(id);
    }

    public BasaPatient addPatient(BasaPatient patient) {
        return patientRepo.save(patient);
    }

}