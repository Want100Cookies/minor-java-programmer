package com.want100cookies.controller;

import com.want100cookies.models.Order;
import com.want100cookies.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "orders", method = RequestMethod.POST)
    public ResponseEntity<?> makeOrder(@RequestBody Order order) {
        orderService.persistOrder(order);
        // Todo: send mail
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "orders", method = RequestMethod.GET)
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(value = "orders/{id}", method = RequestMethod.GET)
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }
}
