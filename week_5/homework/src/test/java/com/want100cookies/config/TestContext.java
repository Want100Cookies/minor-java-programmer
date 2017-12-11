package com.want100cookies.config;

import com.want100cookies.service.LaptopService;
import com.want100cookies.service.OrderService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.want100cookies.controller")
public class TestContext {

    @Bean
    public LaptopService laptopService() {
        return Mockito.mock(LaptopService.class);
    }

    @Bean
    public OrderService orderService() {
        return Mockito.mock(OrderService.class);
    }
}
