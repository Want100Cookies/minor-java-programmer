package com.Want100Cookies.services;

import com.Want100Cookies.models.Laptop;

import java.util.List;

public interface LaptopService {

    List<Laptop> getAllLaptops();

    Laptop getLaptopById(long id);
}
