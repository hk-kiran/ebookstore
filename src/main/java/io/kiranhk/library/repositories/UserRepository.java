package io.kiranhk.library.repositories;

import java.util.List;
import io.kiranhk.library.models.LibraryUser;

public interface UserRepository {
    LibraryUser save(LibraryUser user);

    List<LibraryUser> findAll();
}