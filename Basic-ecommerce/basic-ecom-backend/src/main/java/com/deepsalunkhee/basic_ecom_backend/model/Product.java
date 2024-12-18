package com.deepsalunkhee.basic_ecom_backend.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String brand;
    private String category;
    private Date releaseDate;
    private Boolean isAvailable;
    private int quantity;
}
