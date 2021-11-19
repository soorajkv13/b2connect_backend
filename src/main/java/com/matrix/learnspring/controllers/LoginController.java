package com.matrix.learnspring.controllers;


import com.matrix.learnspring.models.User;
import com.matrix.learnspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public void get(@RequestBody User user) {
        userService.checkUser(user);
    }

}
