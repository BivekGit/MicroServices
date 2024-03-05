package com.bivek.registryservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServicesApplication.class, args);
    }

}
