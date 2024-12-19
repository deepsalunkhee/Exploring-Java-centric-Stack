package com.deepsalunkhee.basic_ecom_backend.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepsalunkhee.basic_ecom_backend.model.Product;
import com.deepsalunkhee.basic_ecom_backend.service.ProductService;

@RestController
@CrossOrigin//this too handle CORS
@RequestMapping("/api")
public class ProductController {
    
    //I am using field injection here. This is not recommended. Use constructor injection instead (why I am not sure my self at this point)
    @Autowired 
    private ProductService service; 

    @GetMapping("/")
    public String confirmation(){
        return "The backend is up";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){

        //controller->service->repo->database
        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = service.getProductById(id);
        if(product== null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
}
