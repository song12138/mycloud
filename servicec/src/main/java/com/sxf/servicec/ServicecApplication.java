package com.sxf.servicec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicecApplication.class, args);
    }
}
