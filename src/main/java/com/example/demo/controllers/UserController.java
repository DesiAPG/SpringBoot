package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("Duvan");
        user.setId(1312L);
        user.setSurname("Marin");
        user.setEmail("mail@duvan.com");
        user.setPhone("3208856258");
        user.setPassword("1234");

        User user1 = new User();
        user1.setName("Camilo");
        user1.setId(423L);
        user1.setSurname("Camacho");
        user1.setEmail("mail@camilo.com");
        user1.setPhone("3112210042");
        user1.setPassword("1234");

        User user2 = new User();
        user2.setName("Juan");
        user2.setId(5134L);
        user2.setSurname("martinez");
        user2.setEmail("mail@juan.com");
        user2.setPhone("3214153030");
        user2.setPassword("1234");

        users.add(user);
        users.add(user1);
        users.add(user2);

        return users;
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