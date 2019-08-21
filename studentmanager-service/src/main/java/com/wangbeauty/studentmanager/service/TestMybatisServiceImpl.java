package com.wangbeauty.studentmanager.service;

import com.wangbeauty.studentmanager.biz.TestMybatisBiz;
import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wangjunwen
 * @version Id: TestMybatisServiceImpl.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */

@Slf4j
@Service
public class TestMybatisServiceImpl implements TestMybatisService {

	@Autowired
	private TestMybatisBiz testMybatisBiz;

	/**
	 * 新增
	 * @param testMyBatisReqDTO DTO
	 * @return 操作行数
	 */
	@Override
	public int insertTestName(TestMyBatisReqDTO testMyBatisReqDTO) {
		return testMybatisBiz.insertTestName(testMyBatisReqDTO);
	}
}
