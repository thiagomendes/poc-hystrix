package com.tmdev.test.pochystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class PocHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocHystrixApplication.class, args);
    }

}
