package com.example.gatewayspringcloud01.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.net.URI;

//@Component
//@Slf4j
//public class GlobalFilterGateway implements GlobalFilter, Order {
//    @Override
//    public int value() {
//        return 0;
//    }
//
//    @Override
//    public Class<? extends Annotation> annotationType() {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        MultiValueMap<String, String> queryParams = request.getQueryParams();
//
//            URI uri = request.getURI();
//            System.out.println(request.getCookies());
//            System.out.println(request.getId());
//            System.out.println(request.getLocalAddress());
//            System.out.println(request.getPath());
//            System.out.println(request.getQueryParams());
//            System.out.println(request.getHeaders());
//            System.out.println(request.getSslInfo());
//            System.out.println(request.getURI());
//            if (queryParams.get("username") == null) {
//                log.info("请求参数错误");
//                exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
//                return exchange.getResponse().setComplete();
//            }
//            return chain.filter(exchange);
//        }
//    }
