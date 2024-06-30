package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.model.UserModel;
import com.example.user.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel registerUser(UserModel user) {
        // Add security measures like password hashing here
        UserModel data=userRepository.save(user);
        System.out.println(data);
        return  data;
    }

    public UserModel fetchUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }
}
