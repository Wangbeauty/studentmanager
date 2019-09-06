package com.wangbeauty.studentmanager.manager;

import com.wangbeauty.studentmanager.mapper.TestMybatisMapper;
import com.wangbeauty.studentmanager.model.TestMybatis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wangjunwen
 * @version Id: TestMybatisManager.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
@Slf4j
@Component
public class TestMybatisManager {

	@Autowired
	private TestMybatisMapper testMybatisMapper;

	/**
	 * 新增
	 * @param testMybatis 实体类
	 * @return 操作行数
	 */
	public int insertTestName(TestMybatis testMybatis) {
		return testMybatisMapper.insertTestName(testMybatis);
	}
}
