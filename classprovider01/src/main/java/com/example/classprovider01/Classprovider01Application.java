package com.example.classprovider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Classprovider01Application {

    public static void main(String[] args) {
        SpringApplication.run(Classprovider01Application.class, args);
    }

}
