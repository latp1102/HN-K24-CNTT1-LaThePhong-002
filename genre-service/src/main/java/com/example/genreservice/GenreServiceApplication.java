package com.example.genreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GenreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreServiceApplication.class, args);
    }

}
