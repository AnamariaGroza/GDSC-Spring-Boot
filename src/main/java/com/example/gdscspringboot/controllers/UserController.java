package com.example.gdscspringboot.controllers;


import entities.User;
import entities.UserContainer;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String getAllUsers(){
        return "ok";
    }
    @PutMapping()
    public User createUser(@RequestBody User user){
        return user;
    }

//    @PostMapping("/{id}")
//    public Integer testPost(@PathVariable Integer id, @RequestParam("number") int number){
//        return number;
//    }
    @PostMapping("/{id}")
    public UserContainer testPost(@RequestBody User user,@PathVariable Integer id, @RequestParam("number") int number){
        final UserContainer userContainer = new UserContainer();
        userContainer.setUser(user);
        userContainer.setId(id);
        userContainer.setSerialNumber(number);

        return userContainer;
    }
}
