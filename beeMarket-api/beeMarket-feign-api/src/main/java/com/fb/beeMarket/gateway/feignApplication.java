package com.fb.beeMarket.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.fb"})
@EnableDiscoveryClient
@EnableFeignClients
public class feignApplication {
    public static void main(String[] args) {
        SpringApplication.run(feignApplication.class,args);
    }
}
