package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.BasaProduct;
import com.examly.springapp.service.BasaProductService;

@RestController
public class BasaProductController {
    @Autowired
    BasaProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<BasaProduct> postMethod(@RequestBody BasaProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<BasaProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<BasaProduct>> dndcjk() {
        List<BasaProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<BasaProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<BasaProduct>> getbyid(@PathVariable String productCategory) {
        List<BasaProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<BasaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<BasaProduct>> getbdyid(@PathVariable String priceCategory) {
        List<BasaProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<BasaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
