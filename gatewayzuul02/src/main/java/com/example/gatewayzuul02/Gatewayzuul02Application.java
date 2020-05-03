package com.example.gatewayzuul02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Gatewayzuul02Application {

    public static void main(String[] args) {
        SpringApplication.run(Gatewayzuul02Application.class, args);
    }

}
