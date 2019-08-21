package com.wangbeauty.studentmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = "com.wangbeauty")
@MapperScan("com.wangbeauty.studentmanager.mapper")
@EnableAsync
public class StudentManager {

    public static void main(String[] args) {
        new SpringApplication(StudentManager.class).run(args);
    }
}

