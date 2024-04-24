package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.Basamodel;
import com.example.day5cw1.repository.Basarepo;

@Service
public class BasaProductService {
    public Basarepo productRepo;
    public BasaProductService(Basarepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(Basamodel product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Basamodel product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public Basamodel getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
