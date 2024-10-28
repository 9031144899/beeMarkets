package com.fb.beeMarkets.gateway.controller;

import com.fb.beeMarkets.gateway.CustomerFeignApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/trade")
public class TradeController {

    @Resource
    private CustomerFeignApi customerFeignApi;

    @GetMapping("/getTrade")
    public String getTrade(){
        String customerName = customerFeignApi.getCustomerName();
        return customerName;
    }
}
