package com.example.user_login_form.controller;

import com.example.user_login_form.model.User;
import com.example.user_login_form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String saveUser(@RequestBody User user){
        String res= userService.addUser(user);
        return res;
    }

    @GetMapping("/getAll")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUserById(id);
    }

}
