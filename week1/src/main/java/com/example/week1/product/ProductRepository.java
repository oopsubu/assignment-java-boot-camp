package com.example.week1.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Set<Product> findByNameContaining(String productName);
}