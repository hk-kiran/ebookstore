package io.kiranhk.ebookstore.repositories;

import java.util.*;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.Cart;

@Repository
public class BookCarts {

    private static final Map<Long, Cart> datastore = new HashMap<>();

    public static Map<Long, Cart> getDatastore() {
        return datastore;
    }
}
