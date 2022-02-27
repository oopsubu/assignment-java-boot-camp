package com.example.week1.user;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private static final Logger log
            = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Integer id) {
        log.info("/user/{}", id);
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            UserResponse userResponse = modelMapper.map(user.get(), UserResponse.class);
            return new ResponseEntity<>(userResponse, HttpStatus.OK);
        }
        throw new UserNotFoundException("Not found User with id = " + id);
    }
}
