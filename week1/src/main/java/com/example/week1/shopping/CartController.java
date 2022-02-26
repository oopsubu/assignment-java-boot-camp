package com.example.week1.shopping;

import com.example.week1.product.Product;
import com.example.week1.product.ProductRepository;
import com.example.week1.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/cart/add/{productId}/{userId}/{quantity}")
    public Map<String, Object> addCart(@PathVariable("productId") int productId, @PathVariable("userId") int userId, @PathVariable("quantity") int quantity){
        CartItem cartItem = cartService.addCart(userId, productId, quantity);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("product", cartItem.getProduct());
        response.put("userPayment", cartItem.getShoppingSession().getUser().getUserPayments());
//        response.put("userAddress", cartItem.getShoppingSession().getUser().getAddress());
        response.put("quantity", cartItem.getQuantity());
        return response;
    }
}
