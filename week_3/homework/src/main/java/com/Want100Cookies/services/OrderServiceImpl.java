package com.Want100Cookies.services;

import com.Want100Cookies.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean persistOrder(Order order) {
        // Todo: store order in the DB

        return true;
    }
}
