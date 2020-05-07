package com.hackerone.lookermock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LookerMockApplication {

    public static void main(String[] args) {
        for(String arg:args) {
            System.out.println("------------");
            System.out.println(arg);
            System.out.println("------------");
        }
        SpringApplication.run(LookerMockApplication.class, args);
    }

}
