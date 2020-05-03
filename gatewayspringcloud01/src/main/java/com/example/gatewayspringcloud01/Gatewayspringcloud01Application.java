package com.example.gatewayspringcloud01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gatewayspringcloud01Application {

    public static void main(String[] args) {
        SpringApplication.run(Gatewayspringcloud01Application.class, args);
    }

}
