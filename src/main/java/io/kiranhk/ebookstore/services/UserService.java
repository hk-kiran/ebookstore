package io.kiranhk.ebookstore.services;

import java.util.*;

import io.kiranhk.ebookstore.models.*;

public interface UserService {
    LibraryUser saveUser(LibraryUser user);

    List<LibraryUser> getAllUsers();
}
