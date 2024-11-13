package com.demo.WebApp1.services;

import com.demo.WebApp1.entities.User;

public interface UserService {
    public boolean registerUser(User user);
    public User loginUser(String email, String password);
}
