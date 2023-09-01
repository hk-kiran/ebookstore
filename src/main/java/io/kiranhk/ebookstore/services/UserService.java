package io.kiranhk.ebookstore.services;

import java.util.*;

import io.kiranhk.ebookstore.models.*;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();
}
