package com.travisdemo.travisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravisDemoApplication {

    public static void main(String[] args) {
        System.out.println("Test");
        SpringApplication.run(TravisDemoApplication.class, args);

    }

}
