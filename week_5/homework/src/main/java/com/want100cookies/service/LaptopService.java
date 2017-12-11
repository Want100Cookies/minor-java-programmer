package com.want100cookies.service;

import com.want100cookies.model.Laptop;

import java.util.List;

public interface LaptopService {

    void add(Laptop laptop);

    List<Laptop> getAllLaptops();

    Laptop getLaptop(Long id);
}
