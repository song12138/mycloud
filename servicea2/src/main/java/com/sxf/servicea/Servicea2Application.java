package com.sxf.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Servicea2Application {

    public static void main(String[] args) {
        SpringApplication.run(Servicea2Application.class, args);
    }
}
