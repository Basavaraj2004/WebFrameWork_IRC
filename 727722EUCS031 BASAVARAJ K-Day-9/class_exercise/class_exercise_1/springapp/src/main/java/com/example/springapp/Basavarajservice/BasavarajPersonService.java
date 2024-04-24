package com.example.springapp.Basavarajservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Basavarajmodel.BasavarajPerson;
import com.example.springapp.Basavarajrepository.BasavarajPersonRepo;

@Service
public class BasavarajPersonService {
    public BasavarajPersonRepo personRepo;

    public BasavarajPersonService(BasavarajPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(BasavarajPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<BasavarajPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
