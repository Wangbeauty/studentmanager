package com.wangbeauty.studentmanager.service;

import com.wangbeauty.studentmanager.BaseSpringBootTest;
import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author wangjunwen
 * @version Id: TestMybatisServiceTest.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
public class TestMybatisServiceTest extends BaseSpringBootTest {

	@Autowired
	private TestMybatisService testMybatisService;

	@Test
	public void insertTestNameTest() {
		TestMyBatisReqDTO testMyBatisReqDTO = new TestMyBatisReqDTO();
		testMyBatisReqDTO.setTraceLogId("66634232323ty");
		testMyBatisReqDTO.setTestName("小王");
//		testMyBatisReqDTO.setRecommendNo("123");
		testMybatisService.insertTestName(testMyBatisReqDTO);
	}

	@Resource
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {

		System.out.println("数据源>>>>>>" + dataSource.getClass());
		Connection connection = dataSource.getConnection();

		System.out.println("连接>>>>>>>>>" + connection);
		System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
		connection.close();
	}

}
