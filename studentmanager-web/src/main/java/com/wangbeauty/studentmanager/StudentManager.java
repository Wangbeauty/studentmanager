package com.wangbeauty.studentmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = "com.wangbeauty")
@MapperScan("com.wangbeauty.studentmanager.mapper")
@EnableAsync
public class StudentManager extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(StudentManager.class);
	}

    public static void main(String[] args) {
        new SpringApplication(StudentManager.class).run(args);
    }
}

