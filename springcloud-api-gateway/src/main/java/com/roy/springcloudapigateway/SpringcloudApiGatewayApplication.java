package com.roy.springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApiGatewayApplication.class, args);
    }

}
