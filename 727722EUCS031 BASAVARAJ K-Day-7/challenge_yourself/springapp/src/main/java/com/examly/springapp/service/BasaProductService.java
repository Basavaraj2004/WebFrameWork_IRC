package com.examly.springapp.service;

import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BasaProductService {
    @Autowired
    basaProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(basaProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<basaProduct> getAll() {
        return repo.findAll();

    }

    public List<basaProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<basaProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
