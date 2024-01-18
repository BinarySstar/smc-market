package org.example.smcmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmcMarketApplication {

    public static void main(String[] args) {
        System.out.println("백엔드 초기세팅");
        SpringApplication.run(SmcMarketApplication.class, args);
    }

}
