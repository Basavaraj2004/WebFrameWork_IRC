package com.priyanshu.q_03.Basaservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.q_03.Basamodel.BasaProduct;
import com.priyanshu.q_03.Basarepository.BasaProductRepo;

@Service
public class BasaProductService {

    @Autowired
    private BasaProductRepo productRepo;

    public BasaProduct addProduct(BasaProduct product) {
        return productRepo.save(product);
    }

    public List<BasaProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<BasaProduct> getProductById(int productId) {
        return productRepo.findById(productId);
    }

}
