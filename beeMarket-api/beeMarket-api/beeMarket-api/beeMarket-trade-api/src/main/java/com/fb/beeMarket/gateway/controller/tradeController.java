package com.fb.beeMarket.gateway.controller;

import com.fb.beeMarket.gateway.CustomerFeignApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/trade")
public class tradeController {

    @Resource
    private CustomerFeignApi customerFeignApi;

    @GetMapping("/getTrade")
    public String getTrade(){
        String customerName = customerFeignApi.getCustomerName();
        return customerName;
    }
}
