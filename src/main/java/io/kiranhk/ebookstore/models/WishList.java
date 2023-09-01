package io.kiranhk.ebookstore.models;

import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name = "WISHLIST")
public class WishList {

    private Long id;
    private Map<Long, Integer> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Integer> getBooks() {
        return books;
    }

    public void setBooks(Map<Long, Integer> books) {
        this.books = books;
    }

}
