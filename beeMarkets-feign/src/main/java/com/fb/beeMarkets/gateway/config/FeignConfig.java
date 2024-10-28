package com.fb.beeMarkets.gateway.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer myRetryer() {
        //最大请求次数为3(1+2)，初始间隔时间为100ms，重试间最大间隔时间为1s
        return new Retryer.Default(100,1,3);
    }
    /*@Bean
    public Retryer myRetryer() {
        return Retryer.NEVER_RETRY; //Feign默认配置是不走重试策略的
    }*/
    @Bean
    Logger.Level feignLoggerLevel() {
//        NONE: 默认的,不显示任何日志
//        BASIC: 仅记录请求方法,URL,响应状态码及执行时间
//        HEADERS: 除了BASIC中定义的信息之外,还有请求的和响应的头信息
//        FULL: 除了HEADERS中定义的信息之外,还有请求和响应的正文及其元数据
        return Logger.Level.FULL;
    }
}