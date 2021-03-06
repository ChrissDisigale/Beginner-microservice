package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;

import VO.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
   //create users
    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
    	
        return userService.saveUser(user);
    }

    //get single user with department
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
    	
        return userService.getUserWithDepartment(userId);
        
    }


}