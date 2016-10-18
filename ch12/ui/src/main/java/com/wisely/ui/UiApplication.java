package com.wisely.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //1
@EnableCircuitBreaker //2
@EnableZuulProxy //3
public class UiApplication {
	public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}
