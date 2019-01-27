package com.iuhcoder.webchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AnomymousChatApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AnomymousChatApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AnomymousChatApplication.class);
    }

}

