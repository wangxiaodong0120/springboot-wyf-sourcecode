package com.wisely.ch8_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Ch85Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch85Application.class, args);
    }
}
