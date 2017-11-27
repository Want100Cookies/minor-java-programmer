package com.Want100Cookies.services;

import com.Want100Cookies.models.User;

import java.util.Map;

public interface OrderService {

    boolean makeOrder(User user, long laptopId, Map<Long, Long> laptopOptions);
}
