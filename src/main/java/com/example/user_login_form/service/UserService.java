package com.example.user_login_form.service;


import com.example.user_login_form.model.User;
import com.example.user_login_form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User userReq){
        userRepository.save(userReq);
        return "User saved Successfully into Database";

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User with ID " + id + " deleted successfully.";
    }

}
