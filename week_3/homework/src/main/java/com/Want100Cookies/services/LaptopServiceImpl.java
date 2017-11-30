package com.Want100Cookies.services;

import com.Want100Cookies.models.Laptop;
import com.Want100Cookies.models.LaptopComponent;
import com.Want100Cookies.models.LaptopOption;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Override
    public List<Laptop> getAllLaptops() {
        return Arrays.asList(
                new Laptop(0, "Some laptop", 1700,
                        Arrays.asList(
                                new LaptopComponent(0, "Screen resolution", "Select a screen resolution",
                                        Arrays.asList(
                                                new LaptopOption(0, "1080p", 0),
                                                new LaptopOption(1, "1440p", 150),
                                                new LaptopOption(2, "2160p", 250)
                                        )
                                ),
                                new LaptopComponent(1, "RAM", "Select the amount of RAM",
                                        Arrays.asList(
                                                new LaptopOption(3, "8 GB", 0),
                                                new LaptopOption(4, "16 GB", 105),
                                                new LaptopOption(5, "32 GB", 220)
                                        )
                                ),
                                new LaptopComponent(3, "Processor", "Select the processor",
                                        Arrays.asList(
                                                new LaptopOption(6, "Intel Core i5 @ 3.0Ghz", 0),
                                                new LaptopOption(7, "Intel Core i7 @ 3.5Ghz", 150),
                                                new LaptopOption(8, "Intel Core i7 @ 4.0Ghz", 300)
                                        )
                                )
                        )
                ),
                new Laptop(1, "Another laptop", 900,
                        Arrays.asList(
                                new LaptopComponent(4, "Screen resolution", "Select a screen resolution",
                                        Arrays.asList(
                                                new LaptopOption(9, "1080p", 0),
                                                new LaptopOption(10, "1440p", 150),
                                                new LaptopOption(11, "2160p", 250)
                                        )
                                )
                        )
                ),
                new Laptop(2, "Some laptop", 1700,
                        Arrays.asList(
                                new LaptopComponent(5, "RAM", "Select the amount of RAM",
                                        Arrays.asList(
                                                new LaptopOption(12, "8 GB", 0),
                                                new LaptopOption(13, "16 GB", 105),
                                                new LaptopOption(14, "32 GB", 220)
                                        )
                                )
                        )
                )
        );
    }
}
