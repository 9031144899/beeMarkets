package com.fb.beeMarkets.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "beeMarkets-customer")
public interface CustomerFeignApi {
    @GetMapping("api/coustonmer/getCustomerName")
    public String getCustomerName();
}
