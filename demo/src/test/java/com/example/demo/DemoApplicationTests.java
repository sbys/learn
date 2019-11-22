package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@WebAppConfiguration
class DemoApplicationTests {
    private MockMvc mvc;
    @BeforeTestMethod
    public void setup(){
        mvc= MockMvcBuilders.standaloneSetup(new DemoApplication()).build();
    }

    @Test
    void contextLoads() {
    }

}
