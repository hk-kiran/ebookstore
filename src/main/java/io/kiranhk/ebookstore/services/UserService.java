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
    public User createOrUpdate(User user) {
        return users.save(user);
    }

    @Override
    public User delete(User user) {
        return users.remove(user.getId());
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
    /**
     * This method verifies the user information while user login aginst the
     * database[For now local storage]
     * 
     * @param user
     * @return
     */
    public boolean verifyUser(User user) {
        for (User usr : users.findAll()) {
            if ((usr.getEmail().equals(user.getEmail()) || usr.getUsername().equals(user.getEmail()))
                    && usr.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method chack if the user already exists
     * 
     * @param user
     * @return
     */
    public boolean isUserExist(User user) {
        for (User usr : users.findAll()) {
            if (usr.getEmail().equals(user.getEmail())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method chack if the user name is already in use
     * 
     * @param user
     * @return
     */
    public boolean isDuplicateUserName(User user) {
        for (User usr : users.findAll()) {
            if (usr.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

}
