package com.example.demo.applications.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.package.*")
public class App2 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App2.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world from App 2");
        System.exit(0);
    }
}
