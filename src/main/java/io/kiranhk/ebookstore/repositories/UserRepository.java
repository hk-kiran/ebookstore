package io.kiranhk.ebookstore.repositories;

import java.util.List;

import io.kiranhk.ebookstore.models.LibraryUser;

public interface UserRepository {
    LibraryUser save(LibraryUser user);

    List<LibraryUser> findAll();
}