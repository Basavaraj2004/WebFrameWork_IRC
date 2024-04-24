package com.priyanshu.q_04.Basacontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshu.q_04.Basamodel.BasaPatient;
import com.priyanshu.q_04.Basaservice.PatientService;

@RestController
@RequestMapping("api")
public class BasaPatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public BasaPatient getAllPatient(@RequestBody BasaPatient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<BasaPatient>> getAllPatients() {
        List<BasaPatient> list = patientService.getAllPatients();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<BasaPatient>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<BasaPatient> getPatientById(@PathVariable int patientId) {
        Optional<BasaPatient> patient = patientService.getPatientById(patientId);

        if (patient.isPresent()) {
            return new ResponseEntity<>(patient.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}