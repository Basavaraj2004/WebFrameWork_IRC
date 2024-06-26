package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.BasaProduct;
import com.example.day6cw3.repository.BasaProductRepo;

@Service
public class BasaProductService {
    public BasaProductRepo productRepo;
    public BasaProductService(BasaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(BasaProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<BasaProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<BasaProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public BasaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
