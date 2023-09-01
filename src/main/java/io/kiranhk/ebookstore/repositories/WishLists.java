package io.kiranhk.ebookstore.repositories;

import java.util.*;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.WishList;

@Repository
public class WishLists {
    private static final Map<Long, WishList> datastore = new HashMap<>();

    public static Map<Long, WishList> getDatastore() {
        return datastore;
    }
}
