package com.wangbeauty.studentmanager.biz;

import com.wangbeauty.studentmanager.manager.TestMybatisManager;
import com.wangbeauty.studentmanager.model.TestMybatis;
import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 业务实现类
 * @author wangjunwen
 * @version Id: TestMybatisBiz.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
@Component
public class TestMybatisBiz {

	@Autowired
	private TestMybatisManager testMybatisManager;

	/**
	 * 新增
	 * @param testMyBatisReqDTO DTO
	 * @return 操作行数
	 */
	public int insertTestName(TestMyBatisReqDTO testMyBatisReqDTO) {
		if (testMyBatisReqDTO == null) {
			return 0;
		}
		TestMybatis testMybatis = new TestMybatis();
		testMybatis.setTestName(testMyBatisReqDTO.getTestName());
		testMybatis.setCreatedAt(new Date());
		testMybatis.setCreatedBy("admin");
		testMybatis.setUpdatedAt(new Date());
		testMybatis.setUpdatedBy("admin");
		return testMybatisManager.insertTestName(testMybatis);

	}
}
