package com.fb.beeMarket.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.fb"})
@EnableDiscoveryClient
public class customerApplication {
    public static void main(String[] args) {
        SpringApplication.run(customerApplication.class,args);
    }
}
