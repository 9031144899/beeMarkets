package com.fb.beeMarket.gateway;


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
public class tradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(tradeApplication.class,args);
    }
}
