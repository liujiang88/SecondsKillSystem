package com.liu.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eureka_7001 {
    public static void main(String[] args) {
        SpringApplication.run(eureka_7001.class,args);
    }
}
