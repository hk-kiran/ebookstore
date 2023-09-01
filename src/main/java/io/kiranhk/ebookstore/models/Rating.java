package io.kiranhk.ebookstore.models;

import javax.persistence.*;

@Entity
@Table(name = "RATING")
public class Rating {

    private Long id;
    private float rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
