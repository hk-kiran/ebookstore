package io.kiranhk.ebookstore.repositories;

import java.util.*;
import org.springframework.stereotype.Repository;
import io.kiranhk.ebookstore.models.Book;

@Repository
public class BookCatalogueRepo {

    private static final Map<Long, Book> datastore = new HashMap<>();

    public static Map<Long, Book> getDatastore() {
        return datastore;
    }

}
