package io.kiranhk.ebookstore.services.interfaces;

import java.util.List;

import io.kiranhk.ebookstore.models.Rating;

public interface RatingServices {

    Rating getRatingById(Long id);

    List<Rating> getRatingsAboveX(float rating);

    boolean addOrUpdateRating(Rating r);
}
