package com.want100cookies.controller;

import com.want100cookies.config.TestContext;
import com.want100cookies.model.Laptop;
import com.want100cookies.service.LaptopService;
import com.want100cookies.service.LaptopServiceImpl;
import com.want100cookies.config.WebContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebContext.class, TestContext.class})
@WebAppConfiguration
public class LaptopControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private LaptopService laptopServiceMock;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        Mockito.reset(laptopServiceMock);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getAll_shouldReturnAllLaptops() throws Exception {
        List<Laptop> demoLaptops = LaptopServiceImpl.getDemoData();

        when(laptopServiceMock.getAllLaptops()).thenReturn(demoLaptops);

        mockMvc.perform(get("/api/v1/laptops"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$[0].name", is("Some laptop")))
                .andExpect(jsonPath("$[1].basePrice", is(900.0)))
                .andExpect(jsonPath("$[0].components", hasSize(3)))
                .andExpect(jsonPath("$[2].components", hasSize(1)));
    }
}
