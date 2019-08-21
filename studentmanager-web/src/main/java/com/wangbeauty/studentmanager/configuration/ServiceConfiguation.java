package com.wangbeauty.studentmanager.configuration;

import com.wangbeauty.studentmanager.service.TestMybatisService;
import com.wangbeauty.studentmanager.service.TestMybatisServiceImpl;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ServiceConfiguation {

    @Bean
    @Primary
	public TestMybatisService testMybatisService() {
    	return new TestMybatisServiceImpl();
	}

}
