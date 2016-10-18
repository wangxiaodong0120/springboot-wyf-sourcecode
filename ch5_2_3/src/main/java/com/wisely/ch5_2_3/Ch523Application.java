package com.wisely.ch5_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Ch523Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch523Application.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello Spring Boot!";
    }
}
