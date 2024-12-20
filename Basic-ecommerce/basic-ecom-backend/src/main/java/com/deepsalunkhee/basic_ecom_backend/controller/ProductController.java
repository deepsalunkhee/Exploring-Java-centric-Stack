package com.deepsalunkhee.basic_ecom_backend.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
    @RequestPart MultipartFile imageFile){
        System.out.println("reahced");
        try{
            Product p=service.addProduct(product,imageFile);
            return new ResponseEntity<>(p,HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
    
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Product product = service.getProductById(productId);
        if(product==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        byte[] imageFile=product.getImageData();

        return ResponseEntity.ok()
        .contentType(MediaType.valueOf(product.getImageType()))
        .body(imageFile);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<?> updateProduct(@PathVariable int productId,@RequestPart Product product,
    @RequestPart MultipartFile imageFile){
        System.out.println("reached");
        Product product1=service.updateProduct(productId,product,imageFile);
        if(product1==null){
            return new ResponseEntity<>("No such broduct bro",HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("Updated bro",HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String>deleteProduct(@PathVariable int id){
        Product product=service.getProductById(id);
        if(product!=null){
            service.deleteProduct(id);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no product",HttpStatus.NOT_FOUND);   
        }
    }
}
