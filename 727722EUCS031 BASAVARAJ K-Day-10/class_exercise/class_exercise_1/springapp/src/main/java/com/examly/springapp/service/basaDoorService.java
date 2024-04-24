package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.basaDoor;
import com.examly.springapp.repository.basaDoorRepo;

@Service
public class basaDoorService {
    @Autowired
    private basaDoorRepo doorRepo;

    public basaDoor postData(basaDoor door) {
        return doorRepo.save(door);
    }

    public List<basaDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public basaDoor updateDetail(int doorid, basaDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<basaDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<basaDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public basaDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}