package com.want100cookies.services;

import com.want100cookies.models.Laptop;

import java.util.List;

public interface LaptopService {

    void add(Laptop laptop);

    List<Laptop> getAllLaptops();

    Laptop getLaptop(Long id);

    List<Laptop> getDemoData();
}
