package com.example.user_login_form.service;


import com.example.user_login_form.model.User;
import com.example.user_login_form.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositary userRepositary;

    public String addUser(User userReq){
        userRepositary.save(userReq);
        return "User saved Successfully into Database";

    }

    public List<User> getAllUsers(){
        return userRepositary.findAll();
    }

    public String deleteUserById(int id) {
        userRepositary.deleteById(id);
        return "User with ID " + id + " deleted successfully.";
    }

}
