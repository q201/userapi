package com.example.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String password;

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    
    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

}
