package io.kiranhk.ebookstore.services.interfaces;

public interface BookCartServices {
    Long moveCartToWishList(Long cartId);

    Long moveItemToWishList(Long itemId);

    boolean updateItemQuantity(Long itemId, int diff);

    boolean deleteItemFromCart(Long itemId);
}
