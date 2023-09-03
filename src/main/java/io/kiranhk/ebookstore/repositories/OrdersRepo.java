package io.kiranhk.ebookstore.repositories;

import java.util.*;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.Order;

@Repository
public class OrdersRepo {
    private static final Map<Long, ArrayList<Order>> datastore = new HashMap<>();

    public static Map<Long, ArrayList<Order>> getDatastore() {
        return datastore;
    }
}
