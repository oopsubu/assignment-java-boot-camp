package com.example.week1.shopping;

import com.example.week1.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ShoppingSessionRepository extends JpaRepository<ShoppingSession, Integer> {
}