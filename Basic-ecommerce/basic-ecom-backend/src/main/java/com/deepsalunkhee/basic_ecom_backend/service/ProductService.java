package com.deepsalunkhee.basic_ecom_backend.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.deepsalunkhee.basic_ecom_backend.model.Product;
import com.deepsalunkhee.basic_ecom_backend.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    
    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product,MultipartFile imagFile) throws IOException {
        product.setImageName(imagFile.getOriginalFilename());
        product.setImageType(imagFile.getContentType());
        product.setImageData(imagFile.getBytes());
        return repo.save(product);
    }

    public Product updateProduct(int id,Product productnew,MultipartFile imageFile){
        Product product=repo.findById(id).orElse(null);
        if(product==null){
            return null;
        }
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setBrand(productnew.getBrand());
        product.setCategory(productnew.getCategory());
        product.setStockQuantity(productnew.getStockQuantity());


        try {
            product.setImageData(imageFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return repo.save(product);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword){
        return repo.searchProducts(keyword);
    }
}
