package com.example.microservicioscloudimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviciosCloudImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosCloudImplApplication.class, args);
    }

}
