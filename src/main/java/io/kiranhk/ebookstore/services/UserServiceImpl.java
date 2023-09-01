package io.kiranhk.ebookstore.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.repositories.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public LibraryUser saveUser(LibraryUser user) {
        return userRepository.save(user);
    }

    public List<LibraryUser> getAllUsers() {
        return userRepository.findAll();
    }
}
