package com.project.group5.ebuyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class EBuyApp {

    public static void main(String[] args) {
        SpringApplication.run(EBuyApp.class, args);
    }
}
