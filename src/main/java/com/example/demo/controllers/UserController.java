package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable String id) {
        User user = new User();
        user.setName("Duvan");
        user.setSurname("Marin");
        user.setEmail("mail@duvan.com");
        user.setPhone("3208856258");
        user.setPassword("1234");
        return user;
    }

    @RequestMapping(value = "user")
    public User createUser() {
        User user = new User();
        user.setName("Duvan");
        user.setSurname("Marin");
        user.setEmail("mail@duvan.com");
        user.setPhone("3208856258");
        user.setPassword("1234");
        return user;
    }

    @RequestMapping(value = "user12")
    public User modifyUser() {
        User user = new User();
        user.setName("Duvan");
        user.setSurname("Marin");
        user.setEmail("mail@duvan.com");
        user.setPhone("3208856258");
        user.setPassword("1234");
        return user;
    }


}