package com.wangbeauty.studentmanager.configuration;

import com.wangbeauty.studentmanager.service.TestMybatisService;
import com.wangbeauty.studentmanager.service.TestMybatisServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author wangjunwen
 * @version Id: ServiceConfiguration.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
@Configuration
public class ServiceConfiguration {

	/**
	 * TestMybatisService
	 * @return TestMybatisService
	 */
    @Bean
    @Primary
	public TestMybatisService testMybatisService() {
    	return new TestMybatisServiceImpl();
	}

}
