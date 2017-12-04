package com.want100cookies.services;

import com.want100cookies.models.Order;

public interface OrderService {

    boolean persistOrder(Order order);
}
