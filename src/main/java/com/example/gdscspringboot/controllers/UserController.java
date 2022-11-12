package com.example.gdscspringboot.controllers;


import entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String getAllUsers(){
        return "ok";
    }
    @PutMapping()
    public User createUser(@RequestBody User user){
        //comment
        return user;
    }
}
