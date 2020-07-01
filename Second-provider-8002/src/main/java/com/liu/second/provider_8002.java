package com.liu.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class provider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(provider_8002.class,args);
    }

}
