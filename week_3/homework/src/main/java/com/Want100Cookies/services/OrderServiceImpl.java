package com.Want100Cookies.services;

import com.Want100Cookies.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    LaptopService laptopService;

    @Override
    public boolean makeOrder(User user, long laptopId, Map<Long, Long> selectedOptions) {
        // Get selected laptop
        Laptop laptop = laptopService.getLaptopById(laptopId);

        Map<LaptopComponent, LaptopOption> actualOptions = new HashMap<>();

        // Map the id's of the selected options to the actual objects
        // Todo: make less for loops
        for (Map.Entry<Long, Long> entry : selectedOptions.entrySet()) {
            for (LaptopComponent component : laptop.getComponents()) {
                if (component.getId() == entry.getKey()) {
                    for (LaptopOption option : component.getOptions()) {
                        if (option.getId() == entry.getValue()) {
                            actualOptions.put(component, option);
                            continue;
                        }
                    }
                }
            }
        }

        // Create order
        Order order = new Order(
                -1,
                user,
                laptop,
                actualOptions
        );

        // Todo: store order in the DB

        return false;
    }
}
