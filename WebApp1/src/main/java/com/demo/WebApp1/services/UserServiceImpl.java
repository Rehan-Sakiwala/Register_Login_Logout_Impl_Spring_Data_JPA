package com.demo.WebApp1.services;

import com.demo.WebApp1.entities.User;
import com.demo.WebApp1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean registerUser(User user) {
        boolean status = false;
        try{
            userRepository.save(user);
            status = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public User loginUser(String email, String password) {
        User validUser =userRepository.findByEmail(email);
        if(validUser != null && validUser.getPassword().equals(password)){
            return validUser;
        }
        return null;
    }
}
