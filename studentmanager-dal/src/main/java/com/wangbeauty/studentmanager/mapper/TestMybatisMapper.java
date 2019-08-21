package com.wangbeauty.studentmanager.mapper;

import com.wangbeauty.studentmanager.model.TestMybatis;

/**
 *
 * @author wangjunwen
 * @version Id: TestMybatisMapper.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
public interface TestMybatisMapper {

	/**
	 * 新增
	 * @param testMybatis 实体类
	 * @return 操作行数
	 */
	int insertTestName(TestMybatis testMybatis);
}
