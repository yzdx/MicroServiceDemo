package com.example.micprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * EnableDiscoveryClient和EnableEurekaClient 效果相同   建议使用EnableDiscoveryClient
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableEurekaClient
@MapperScan("com.example.micprovider.news.dao")
public class MicProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicProviderApplication.class, args);
    }

}
