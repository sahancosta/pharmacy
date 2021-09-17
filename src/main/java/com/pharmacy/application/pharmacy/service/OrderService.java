package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Order;
import com.pharmacy.application.pharmacy.model.Payments;

import java.util.List;

public interface OrderService {
    void addOrder(Order order);

    List<Order> getAllOrder();

    void updateOrder(Integer id, Order order);

    void deleteOrder(Integer id);
}
