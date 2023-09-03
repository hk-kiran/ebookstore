package io.kiranhk.ebookstore.services.interfaces;

public interface WishListServices {
    Long moveWishListItemToCart(Long ItemId);

    boolean deleteWishList(Long wlId);

    boolean updateItemQuantity(Long itemId, int diff);

}
