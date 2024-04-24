package com.example.springapp.Basavarajrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Basavarajmodel.BasavarajPerson;

public interface BasavarajPersonRepo extends JpaRepository<BasavarajPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<BasavarajPerson> findByAge(int age);
}
