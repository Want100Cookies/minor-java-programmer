package com.want100cookies.controller;

import com.want100cookies.model.Laptop;
import com.want100cookies.service.LaptopService;
import com.want100cookies.service.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @RequestMapping(value = "laptops", method = RequestMethod.GET)
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @RequestMapping(value = "laptops/{id}", method = RequestMethod.GET)
    public Laptop getLaptop(@PathVariable Long id) {
        return laptopService.getLaptop(id);
    }

    @RequestMapping(value = "laptops/init")
    public ResponseEntity<?> init() {
        for (Laptop laptop : LaptopServiceImpl.getDemoData()) {
            laptopService.add(laptop);
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
