package com.example.week1.product;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/product/list")
    public List<ProductResponse> getProducts(){
        List<ProductResponse> productList = productRepository.findAll().stream().map(post -> modelMapper.map(post, ProductResponse.class))
                .collect(Collectors.toList());
        return productList;
    }

    @GetMapping("/product/{id}")
    public ProductResponse getProductById(@PathVariable int id){
        Optional<Product> product = productRepository.findById(id);
        return modelMapper.map(product.get(), ProductResponse.class);
    }
}
