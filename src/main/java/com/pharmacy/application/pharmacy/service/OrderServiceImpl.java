package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Order;
import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.repository.OrderRepository;
import com.pharmacy.application.pharmacy.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);

    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> orderList = new ArrayList<>();
        orderRepository.findAll().forEach(orderList::add);
        return orderList;

    }

    @Override
    public void updateOrder(Integer id, Order order) {
        order.setOr_id(id);
        orderRepository.save(order);

    }

    @Override
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);

    }
}
