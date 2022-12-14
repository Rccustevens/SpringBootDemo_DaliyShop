package com.edu.bcu.springbootdemo.webapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.edu.bcu.springbootdemo"})
@MapperScan(basePackages = "com.edu.bcu.springbootdemo.dao")
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }
}

//http://localhost:8080/springbootdemo/index