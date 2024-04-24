package com.priyanshu.q_03.Basarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanshu.q_03.Basamodel.BasaProduct;

@Repository
public interface BasaProductRepo extends JpaRepository<BasaProduct, Integer> {

}
