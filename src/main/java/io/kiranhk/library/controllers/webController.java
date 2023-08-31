package io.kiranhk.library.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import io.kiranhk.library.models.LibraryUser;
import io.kiranhk.library.repositories.UserRepository;

@Controller
public class webController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/createaccount")
    public String CreateAccount() {
        return "create_account";
    }

    @PostMapping("/register")
    public ModelAndView Register(@ModelAttribute LibraryUser regForm) {

        userRepository.save(regForm);

        ModelAndView modelAndView = new ModelAndView("registration_success");
        modelAndView.addObject("message", "Registration successful!");
        modelAndView.addObject("formData", regForm);
        return modelAndView;
    }

    // Helpers

    public static class RegistrationForm {
        private String name;
        private String email;
        private String username;
        private String password;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }
}
