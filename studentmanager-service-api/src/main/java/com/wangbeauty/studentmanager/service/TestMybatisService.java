package com.wangbeauty.studentmanager.service;

import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;

/**
 *
 * @author wangjunwen
 * @version Id: TestMybatisService.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */

public interface TestMybatisService {

	/**
	 * 新增
	 * @param testMyBatisReqDTO DTO
	 * @return 操作行数
	 */
	int insertTestName(TestMyBatisReqDTO testMyBatisReqDTO);
}
