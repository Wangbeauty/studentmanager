package com.wangbeauty.studentmanager.service;

import com.wangbeauty.studentmanager.annotation.OperateLogger;
import com.wangbeauty.studentmanager.biz.TestMybatisBiz;
import com.wangbeauty.studentmanager.exception.BusinessException;
import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;
import com.wangbeauty.studentmanager.util.VerifyUtil;
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
	@OperateLogger(desc = "新增测试", operationType = OperateLogger.OperationType.C)
	public int insertTestName(TestMyBatisReqDTO testMyBatisReqDTO) {
		log.info("新增测试开始，请求参数：{}", testMyBatisReqDTO);
		int i = 0;
		try {
			VerifyUtil.validateObject(testMyBatisReqDTO);
			i = testMybatisBiz.insertTestName(testMyBatisReqDTO);
		} catch (BusinessException e) {
			log.info("新增测试异常，异常信息：{}", e);
		}
		log.info("新增测试结束，返回参数：{}", i);
		return i;
	}
}
