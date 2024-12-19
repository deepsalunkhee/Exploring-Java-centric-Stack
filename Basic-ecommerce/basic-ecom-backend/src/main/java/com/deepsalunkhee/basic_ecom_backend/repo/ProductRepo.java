package com.deepsalunkhee.basic_ecom_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepsalunkhee.basic_ecom_backend.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
