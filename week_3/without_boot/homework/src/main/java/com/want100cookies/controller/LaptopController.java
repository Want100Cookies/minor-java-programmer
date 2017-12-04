package com.want100cookies.controller;

import com.want100cookies.models.Laptop;
import com.want100cookies.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }
}
