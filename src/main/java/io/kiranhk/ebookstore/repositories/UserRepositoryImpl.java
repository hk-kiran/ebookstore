package io.kiranhk.ebookstore.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import io.kiranhk.ebookstore.models.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Map<Long, User> datastore = new HashMap<>();

    @Override
    public List<User> findAll() {
        return new ArrayList<User>(datastore.values());
    }

    @Override
    public User save(User user) {

        return datastore.put(user.getId(), user);
    }

}
