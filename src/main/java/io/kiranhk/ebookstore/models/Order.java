package io.kiranhk.ebookstore.models;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;
    private ArrayList<Long> bookIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ArrayList<Long> getBookIds() {
        return bookIds;
    }

    public void setBookIds(ArrayList<Long> bookIds) {
        this.bookIds = bookIds;
    }

}
