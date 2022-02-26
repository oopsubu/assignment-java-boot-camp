package com.example.week1.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/list")
    public List<Product> getProducts(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
