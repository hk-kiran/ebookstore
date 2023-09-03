package io.kiranhk.ebookstore.repositories;

import java.util.*;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.Rating;

@Repository
public class RatingsRepo {
    private static final Map<Long, Rating> datastore = new HashMap<>();

    public static Map<Long, Rating> getDatastore() {
        return datastore;
    }
}
