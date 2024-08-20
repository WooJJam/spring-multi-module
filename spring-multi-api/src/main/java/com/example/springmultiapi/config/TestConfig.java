package com.example.springmultiapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.example.springmultiapi", "com.example.springmultidomain"})
@EntityScan("com.example")
@EnableJpaRepositories("com.example.springmultidomain")
public class TestConfig {
}