package com.Want100Cookies.controllers;

import com.Want100Cookies.models.Laptop;
import com.Want100Cookies.services.LaptopService;
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
