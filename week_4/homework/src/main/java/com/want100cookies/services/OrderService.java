package com.want100cookies.services;

import com.want100cookies.models.Order;

import java.util.List;

public interface OrderService {

    Order persistOrder(Order order);

    List<Order> getAllOrders();

    Order getOrder(Long id);
}
