package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.UserModel;
import com.example.user.service.UserService;   

@RestController
@RequestMapping("/api/user")  
public class UserController {     

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserModel user) {
        try {
            System.out.println( "->"+userService.registerUser(user));
            return ResponseEntity.ok("User registered successfully");
         } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to register user");
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<UserModel> fetchUser(@RequestParam String username) {
        System.out.println(username);
        UserModel user = userService.fetchUserByUsername(username);
        System.out.println(user);
        if (user != null) {
            System.out.println("inside if");
            return ResponseEntity.ok(user);

        } else {
            System.out.println("inside else area");
            throw new UserNotFoundException("User not found with username: " + username);
        }
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}

