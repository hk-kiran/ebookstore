package io.kiranhk.ebookstore.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.repositories.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Users users;

    public User saveUser(User user) {
        return users.save(user);
    }

    public List<User> getAllUsers() {
        return users.findAll();
    }
}
