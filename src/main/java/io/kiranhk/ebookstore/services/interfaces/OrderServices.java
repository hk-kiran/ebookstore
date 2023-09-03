package io.kiranhk.ebookstore.services.interfaces;

import java.util.List;

import io.kiranhk.ebookstore.models.Order;

public interface OrderServices {
    Order getById(Long id);

    List<Order> getLastNOrders(int n);

    boolean newOrder(Order newOrder);

    Order getCurrentOrder();
}
