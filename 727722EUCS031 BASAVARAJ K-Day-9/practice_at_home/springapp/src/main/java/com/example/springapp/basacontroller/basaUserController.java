package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.basaUser;
import com.example.springapp.service.basaUserService;

@RestController
@RequestMapping("/api")
public class basaUserController {
    
    @Autowired
    private basaUserService userService;

    @PostMapping("/user")
    public ResponseEntity<basaUser> post(@RequestBody basaUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<basaUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<basaUser> getById(@PathVariable int userId)
    {
        basaUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<basaUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<basaUser> getByUserName(@PathVariable String userName)
    {
        basaUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<basaUser>(user, HttpStatus.OK);
        }
    }
}
