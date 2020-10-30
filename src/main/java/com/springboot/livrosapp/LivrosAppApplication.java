package com.springboot.livrosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.springboot.livrosapp.entity" })
@EnableJpaRepositories(basePackages = { "com.springboot.livrosapp.repository" })
@ComponentScan(basePackages = {"com.springboot.livrosapp.controller"})
public class LivrosAppApplication {
      public static void main(String[] args) {
            SpringApplication.run(LivrosAppApplication.class, args);
      }
}