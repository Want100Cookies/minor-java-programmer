package com.want100cookies.services;

import com.want100cookies.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    public boolean persistOrder(Order order) {
        // Todo: store order in the DB

        return true;
    }
}
