package io.kiranhk.ebookstore.repositories;

import java.util.List;

import io.kiranhk.ebookstore.models.User;

public interface UserRepository {
    User save(User user);

    List<User> findAll();
}