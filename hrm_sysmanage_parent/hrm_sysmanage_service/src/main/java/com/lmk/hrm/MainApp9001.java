package com.lmk.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lmk.hrm.mapper")
public class MainApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp9001.class,args);
    }
}
