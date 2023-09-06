package io.kiranhk.ebookstore.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.services.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class webController {

    @Autowired
    private UserService userService;

    @GetMapping("/createaccount")
    public String CreateAccount() {
        return "create_account";
    }

    @PostMapping("/register")
    public ResponseEntity<String> Register(@RequestBody User userData) {
        User user = userService.createOrUpdate(userData);
        System.out.println(user);
        if (user != null && user.getId() != null) {
            return ResponseEntity.ok("User Registered Successfully");
        }
        return ResponseEntity.badRequest().body("Bad Request");
    }
}
