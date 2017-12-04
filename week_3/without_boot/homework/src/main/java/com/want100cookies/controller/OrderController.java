package com.want100cookies.controller;

import com.want100cookies.models.Order;
import com.want100cookies.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> makeOrder(@RequestBody Order order) {
        if (orderService.persistOrder(order)) {
            // Todo: send mail
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
