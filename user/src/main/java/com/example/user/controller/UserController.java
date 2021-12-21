package com.example.user.controller;

import com.example.user.domain.User;
import com.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Value("${dbconfig}")
    private String username;

    @RequestMapping("/users")
    public List<User> users(){
        System.err.println("user1: " + username);
        return userMapper.findAll();
    }
}