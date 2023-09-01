package io.kiranhk.library.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.kiranhk.library.repositories.*;
import io.kiranhk.library.models.*;

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
