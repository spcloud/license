package com.spcloud.license;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.spcloud.license.mapper")
public class LicenseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicenseApplication.class, args);
    }

}
