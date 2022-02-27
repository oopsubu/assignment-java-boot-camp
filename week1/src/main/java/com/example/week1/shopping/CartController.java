package com.example.week1.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    CartService cartService;
    @Autowired
    CartItemRepository cartItemRepository;

    @PostMapping("/cart/add/{productId}/{userId}/{quantity}")
    public ResponseEntity<CartItem> addCart(@PathVariable("productId") int productId, @PathVariable("userId") int userId, @PathVariable("quantity") int quantity){
        CartItem cartItem = cartService.addCart(userId, productId, quantity);
        return new ResponseEntity<>(cartItem, HttpStatus.CREATED);
    }

    @GetMapping("/cart/{cartId}")
    public ResponseEntity<CartItem> getCart(@PathVariable("cartId") int cartId){
        CartItem cartItem = cartItemRepository.findById(cartId).get();
        return new ResponseEntity<>(cartItem, HttpStatus.CREATED);
    }
}
