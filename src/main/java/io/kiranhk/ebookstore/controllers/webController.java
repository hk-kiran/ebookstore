package io.kiranhk.ebookstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.services.UserService;

@Controller
public class webController {

    @Autowired
    private UserService userService;

    @GetMapping("/createaccount")
    public String CreateAccount() {
        return "create_account";
    }

    @PostMapping("/register")
    public @ResponseBody ModelAndView Register(@ModelAttribute User userData) {

        userService.createOrUpdate(userData);

        ModelAndView modelAndView = new ModelAndView("registration_success");
        modelAndView.addObject("message", "Registration successful!");
        System.out.println(userService.getAll().toString());
        modelAndView.addObject("formData", userData);
        return modelAndView;
    }

}
