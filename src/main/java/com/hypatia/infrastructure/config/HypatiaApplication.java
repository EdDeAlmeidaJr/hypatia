package com.hypatia.infrastructure.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.hypatia")
@EnableMongoRepositories(basePackages = "com.hypatia.infrastructure.adapter.output.mongodb")
public class HypatiaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HypatiaApplication.class, args);
    }
}
