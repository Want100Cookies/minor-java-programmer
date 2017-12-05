package com.want100cookies.services;

import com.want100cookies.models.Order;
import com.want100cookies.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    public Order persistOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrder(Long id) {
        return repository.findOne(id);
    }
}
