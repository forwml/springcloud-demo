package com.wml.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerEurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerEurekaDemoApplication.class, args);
    }
}
