package com.Want100Cookies.services;

import com.Want100Cookies.models.Order;

public interface OrderService {

    boolean persistOrder(Order order);
}
