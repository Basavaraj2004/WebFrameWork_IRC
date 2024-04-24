package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Product;

@Repository
public interface BasaProductRepo extends JpaRepository<basaProduct, Integer> {

    public List<basaProduct> findByProductCategory(String productCategory);
    public List<basaProduct> findByPriceCategory(String priceCategory);

}
