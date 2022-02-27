package com.example.week1.shopping;

import com.example.week1.product.Product;
import com.example.week1.product.ProductRepository;
import com.example.week1.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class CartService {

    @Autowired
    ShoppingSessionRepository shoppingSessionRepository;
    @Autowired
    CartItemRepository cartItemRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;

    public CartItem addCart(int userId, int productId, int quantity){
        ShoppingSession shoppingSession = new ShoppingSession();
        shoppingSession.setUser(userRepository.findById(userId).get());
        shoppingSession.setModifiedAt(new Timestamp(System.currentTimeMillis()));
        shoppingSession.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        shoppingSession = shoppingSessionRepository.save(shoppingSession);
        Product product = productRepository.findById(productId).get();
        CartItem cartItem = new CartItem();
        cartItem.setCartItem(product);
        cartItem.setQuantity(quantity);
        cartItem.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        cartItem.setShoppingSession(shoppingSession);
        cartItem = cartItemRepository.save(cartItem);
        return cartItem;
    }
}
