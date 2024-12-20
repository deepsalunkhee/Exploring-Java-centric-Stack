package com.deepsalunkhee.basic_ecom_backend.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// @Entity is a JPA annotation to make this object ready for storage in a JPA-based data store.
@Entity
// @Data is a Lombok annotation to create all the getters, setters, equals, hash, and toString methods, based on the fields.
@Data 
// @NoArgsConstructor is a Lombok annotation to create a no-argument constructor.
@NoArgsConstructor
// @AllArgsConstructor is a Lombok annotation to create a constructor with all the arguments.
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public Product(int id) {
        this.id = id;
    }
}
