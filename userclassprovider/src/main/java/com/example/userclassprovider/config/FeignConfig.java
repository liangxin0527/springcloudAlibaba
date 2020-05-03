package com.example.userclassprovider.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FeignConfig {
    @Bean
    Logger.Level getLogger() {
        return Logger.Level.FULL;
    }
}
