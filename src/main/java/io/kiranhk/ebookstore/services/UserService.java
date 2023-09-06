package io.kiranhk.ebookstore.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kiranhk.ebookstore.models.*;
import io.kiranhk.ebookstore.repositories.*;
import io.kiranhk.ebookstore.services.interfaces.BasicServices;

@Service
public class UserService implements BasicServices<User> {

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

}
