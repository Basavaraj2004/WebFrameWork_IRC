package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.basaVillage;
import com.example.springapp.service.basaVillageService;

@RestController
public class basaVillageController {
    @Autowired
    private basaVillageService ser;

    @PostMapping("/api/village")
    public ResponseEntity<basaVillage> post(@RequestBody basaVillage person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/byname/{villageName}")
    public ResponseEntity<basaVillage> getAll(@PathVariable String villageName) {
        basaVillage li = ser.start(villageName);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/bypopulation/{villagePopulation}")
    public ResponseEntity<List<basaVillage>> getbyAge(@PathVariable int villagePopulation) {
        List<basaVillage> li = ser.end(villagePopulation);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/{villageId}")
    public ResponseEntity<basaVillage> get3(@PathVariable int villageId) {
        basaVillage li = ser.get3(villageId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
