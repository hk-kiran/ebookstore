package io.kiranhk.ebookstore.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.repositories.UsersRepo;
import io.kiranhk.ebookstore.services.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class webController {

    private static final Logger log = LoggerFactory.getLogger(UsersRepo.class);

    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    public ResponseEntity<String> SignIn(@RequestBody User userData) {
        log.info("received signin request");
        var isValid = userService.verifyUser(userData);
        System.out.println(userData);
        if (isValid) {
            log.info("signed in successfully");
            return ResponseEntity.ok("Valid Credentials");
        }
        log.info("Invalid Credentials");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
    }

    @PostMapping("/register")
    public ResponseEntity<String> Register(@RequestBody User userData) {
        log.info("received register request");
        User user = userService.createOrUpdate(userData);
        System.out.println(user);
        if (user != null && user.getId() != null) {
            log.info("registered successfully");
            return ResponseEntity.ok("User Registered Successfully");
        }
        log.info("Bad request");
        return ResponseEntity.badRequest().body("Bad Request");
    }
}
