package com.lmk.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MainApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp7001.class,args);
    }
}
