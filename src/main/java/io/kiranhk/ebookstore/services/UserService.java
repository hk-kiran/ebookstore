package io.kiranhk.ebookstore.services;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.repositories.*;
import io.kiranhk.ebookstore.services.interfaces.BasicServices;

@Service
public class UserService implements BasicServices<User> {
    private static final Logger log = LoggerFactory.getLogger(UsersRepo.class);

    @Autowired
    private UsersRepo users;

    @Override
    public User createOrUpdate(User object) {
        return users.save(object);
    }

    @Override
    public User delete(User object) {
        return users.remove(object.getId());
    }

    @Override
    public List<User> getAll() {
        return users.findAll();
    }

    @Override
    public User getById(Long id) {
        return users.get(id);
    }

    // TODO: Optimize
    public boolean verifyUser(User user) {
        for (User usr : users.findAll()) {
            if (usr.getEmail().equals(user.getEmail()) && usr.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }

}
