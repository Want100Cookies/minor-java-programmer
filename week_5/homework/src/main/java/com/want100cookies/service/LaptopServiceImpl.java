package com.want100cookies.service;

import com.want100cookies.model.Laptop;
import com.want100cookies.model.LaptopComponent;
import com.want100cookies.model.LaptopOption;
import com.want100cookies.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    LaptopRepository repository;

    public void add(Laptop laptop) {
        repository.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return repository.findAll();
    }

    public Laptop getLaptop(Long id) {
        return repository.findOne(id);
    }

    public static List<Laptop> getDemoData() {
        return Arrays.asList(
                new Laptop("Some laptop", 1700,
                        Arrays.asList(
                                new LaptopComponent("Screen resolution", "Select a screen resolution",
                                        Arrays.asList(
                                                new LaptopOption("1080p", 0),
                                                new LaptopOption("1440p", 150),
                                                new LaptopOption("2160p", 250)
                                        )
                                ),
                                new LaptopComponent("RAM", "Select the amount of RAM",
                                        Arrays.asList(
                                                new LaptopOption("8 GB", 0),
                                                new LaptopOption("16 GB", 105),
                                                new LaptopOption("32 GB", 220)
                                        )
                                ),
                                new LaptopComponent("Processor", "Select the processor",
                                        Arrays.asList(
                                                new LaptopOption("Intel Core i5 @ 3.0Ghz", 0),
                                                new LaptopOption("Intel Core i7 @ 3.5Ghz", 150),
                                                new LaptopOption("Intel Core i7 @ 4.0Ghz", 300)
                                        )
                                )
                        )
                ),
                new Laptop("Another laptop", 900,
                        Arrays.asList(
                                new LaptopComponent("Screen resolution", "Select a screen resolution",
                                        Arrays.asList(
                                                new LaptopOption("1080p", 0),
                                                new LaptopOption("1440p", 150),
                                                new LaptopOption("2160p", 250)
                                        )
                                )
                        )
                ),
                new Laptop("Some laptop", 1700,
                        Arrays.asList(
                                new LaptopComponent("RAM", "Select the amount of RAM",
                                        Arrays.asList(
                                                new LaptopOption("8 GB", 0),
                                                new LaptopOption("16 GB", 105),
                                                new LaptopOption("32 GB", 220)
                                        )
                                )
                        )
                )
        );
    }
}
