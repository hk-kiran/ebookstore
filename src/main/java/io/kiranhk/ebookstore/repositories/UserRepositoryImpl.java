package io.kiranhk.ebookstore.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import io.kiranhk.ebookstore.models.LibraryUser;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Map<Long, LibraryUser> datastore = new HashMap<>();

    @Override
    public List<LibraryUser> findAll() {
        return new ArrayList<LibraryUser>(datastore.values());
    }

    @Override
    public LibraryUser save(LibraryUser user) {

        return datastore.put(user.getId(), user);
    }

}
