package com.fb.beeMarket.customer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coustonmer")
public class testController {

    @GetMapping("/getCustomerName")
    public String getCustomerName(){
        return "天命人";
    }

}
