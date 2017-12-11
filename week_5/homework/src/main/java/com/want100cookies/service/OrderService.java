package com.want100cookies.service;

import com.want100cookies.model.Order;

import java.util.List;

public interface OrderService {

    Order persistOrder(Order order);

    List<Order> getAllOrders();

    Order getOrder(Long id);
}
