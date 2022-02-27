package com.example.week1.shopping;

import com.example.week1.product.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    CartService cartService;
    @Autowired
    CartItemRepository cartItemRepository;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/cart/add/{productId}/{userId}/{quantity}")
    public ResponseEntity<CartItemResponse> addCart(@PathVariable("productId") int productId, @PathVariable("userId") int userId, @PathVariable("quantity") int quantity){
        CartItem cartItem = cartService.addCart(userId, productId, quantity);
        CartItemResponse cartItemResponse = modelMapper.map(cartItem, CartItemResponse.class);
        return new ResponseEntity<>(cartItemResponse, HttpStatus.CREATED);
    }

    @GetMapping("/cart/{cartId}")
    public ResponseEntity<CartItemResponse> getCart(@PathVariable("cartId") int cartId){
        Optional<CartItem> cartItem = cartItemRepository.findById(cartId);
        CartItemResponse cartItemResponse = modelMapper.map(cartItem.get(), CartItemResponse.class);
        return new ResponseEntity<>(cartItemResponse, HttpStatus.OK);
    }
}
