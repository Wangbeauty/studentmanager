package com.wangbeauty.studentmanager;

import com.wangbeauty.studentmanager.service.TestMybatisService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.mock;

//@Profile("unittest")
@Configuration
public class ServiceTestConfiguation {

    @Bean
    @Primary
	TestMybatisService testMybatisService() {
		TestMybatisService p = mock(TestMybatisService.class);
        return p;
    }

}
