package com.wangbeauty.studentmanager.controller;

import com.wangbeauty.studentmanager.model.request.TestMyBatisReqDTO;
import com.wangbeauty.studentmanager.service.TestMybatisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author wangjunwen
 * @version Id: TestController.java, v 1.0 2019/8/16 wangjunwen Exp $$
 */
@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestMybatisService testMybatisService;

	@RequestMapping(value="/hello", produces = {"application/json; charset=UTF-8"}, method = RequestMethod.GET)
	public ResponseEntity<Object> testHello(@RequestParam("name") String name) {
		TestMyBatisReqDTO testMyBatisReqDTO = new TestMyBatisReqDTO();
		testMyBatisReqDTO.setTestName("小王");
		testMybatisService.insertTestName(testMyBatisReqDTO);
		return new ResponseEntity<>(name, HttpStatus.OK);
	}
}
