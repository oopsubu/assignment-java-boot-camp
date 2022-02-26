package com.example.week1.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);userResponse.setUserPayments(user.get().getUserPayments());
        return userRepository.findById(id).get();
    }
}
