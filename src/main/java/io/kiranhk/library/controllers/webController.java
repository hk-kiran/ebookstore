package io.kiranhk.library.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import io.kiranhk.library.models.*;
import io.kiranhk.library.services.*;

@Controller
public class webController {

    @Autowired
    private UserService userService;

    @GetMapping("/createaccount")
    public String CreateAccount() {
        return "create_account";
    }

    @PostMapping("/register")
    public @ResponseBody ModelAndView Register(@ModelAttribute LibraryUser userData) {

        userService.saveUser(userData);

        ModelAndView modelAndView = new ModelAndView("registration_success");
        modelAndView.addObject("message", "Registration successful!");
        System.out.println(userService.getAllUsers().toString());
        System.out.println(userService.getAllUsers().toString());
        modelAndView.addObject("formData", userData);
        return modelAndView;
    }

}
