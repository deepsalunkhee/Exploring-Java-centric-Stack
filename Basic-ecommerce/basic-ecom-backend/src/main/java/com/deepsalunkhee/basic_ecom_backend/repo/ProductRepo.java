package com.deepsalunkhee.basic_ecom_backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepsalunkhee.basic_ecom_backend.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    //this is a custom query
    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1% OR p.brand LIKE %?1% OR p.category LIKE %?1%")
    public List<Product>searchProducts(String keyword);

}
