package io.kiranhk.ebookstore.repositories;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.User;

@Repository
public class UsersRepo {
    static {
        System.out.println("called");
    }

    private static final Logger log = LoggerFactory.getLogger(UsersRepo.class);
    private static final Map<Long, User> datastore = new HashMap<>();

    public List<User> findAll() {
        return new ArrayList<User>(datastore.values());
    }

    public User save(User user) {
        datastore.put(user.getId(), user);
        return datastore.get(user.getId());
    }

    public User get(Long id) {
        if (datastore.containsKey(id) == true) {
            return datastore.get(id);
        }
        log.warn("ID not found: " + id);
        return new User();
    }

    public boolean isPresent(User user) {
        if (datastore.containsKey(user.getId()) == true) {
            return true;
        }
        return false;
    }

    public User remove(Long id) {
        User user = get(id);
        datastore.remove(id);
        return user;
    }
}
