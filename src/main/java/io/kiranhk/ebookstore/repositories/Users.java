package io.kiranhk.ebookstore.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import io.kiranhk.ebookstore.models.User;

@Repository
public class Users {

    private static final Map<Long, User> datastore = new HashMap<>();

    public List<User> findAll() {
        return new ArrayList<User>(datastore.values());
    }

    public User save(User user) {

        return datastore.put(user.getId(), user);
    }

}
