package com.demo.WebApp1.controllers;

import com.demo.WebApp1.entities.User;
import com.demo.WebApp1.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;

@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String openRegPage(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/regForm")
    public String submitRegForm(@ModelAttribute("user")User user, Model model){
        boolean status = userService.registerUser(user);
        if(status){
            model.addAttribute("successMsg","User added successfully");
        }
        else{
            model.addAttribute("errorMsg","User not registered");
        }
        return "register";
    }

    @GetMapping("/loginPage")
    public String openLoginPage(Model model){
        model.addAttribute("user","new User()");
        return "login";
    }

    @PostMapping("/loginForm")
    public  String submitLoginForm(@ModelAttribute("user") User user, Model model){
        User validUser = userService.loginUser(user.getEmail(), user.getPassword());
        if(validUser != null){
            model.addAttribute("modelName", validUser.getName());
            return "profile";
        }
        else {
            model.addAttribute("errorMsg", "Cannot login, Please try again!!");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest httpServletRequest){
        HttpSession session =  httpServletRequest.getSession(false);
        if(session != null){
            session.invalidate();
        }
        return "login";
    }
}
