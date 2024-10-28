package com.fb.beeMarket.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "beeMarket-customer-api")
public interface CustomerFeignApi {
    @GetMapping("api/coustonmer/getCustomerName")
    public String getCustomerName();
}
