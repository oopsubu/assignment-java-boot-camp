package com.example.week1.shopping;

import com.example.week1.product.Product;
import com.example.week1.product.ProductRepository;
import com.example.week1.user.User;
import com.example.week1.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.sql.Timestamp;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    ShoppingSessionRepository shoppingSessionRepository;
    @Autowired
    CartItemRepository cartItemRepository;

    public CartItem addCart(int userId, int productId, int quantity){
        User user = new User();
        user.setId(userId);
        ShoppingSession shoppingSession = new ShoppingSession();
        shoppingSession.setUser(user);
        shoppingSession.setModifiedAt(new Timestamp(System.currentTimeMillis()));
        shoppingSession.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        shoppingSession = shoppingSessionRepository.save(shoppingSession);
        Product product = new Product();
        product.setId(productId);
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        cartItem.setShoppingSession(shoppingSession);
        cartItem = cartItemRepository.save(cartItem);

        return cartItem;
    }
}
