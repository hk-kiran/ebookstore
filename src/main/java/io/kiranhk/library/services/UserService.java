package io.kiranhk.library.services;

import java.util.*;
import io.kiranhk.library.models.*;

public interface UserService {
    LibraryUser saveUser(LibraryUser user);

    List<LibraryUser> getAllUsers();
}
