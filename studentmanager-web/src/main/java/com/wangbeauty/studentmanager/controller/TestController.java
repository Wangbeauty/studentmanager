package com.wangbeauty.studentmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author wangjunwen
 * @version Id: TestController.java, v 1.0 2019/8/16 wangjunwen Exp $$
 */
@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

	@Value("jdbc.jdbcUsername")
	private String jdbcName;

	@RequestMapping("/hello")
	public Object testHello(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		log.info("name:{}", name);
		log.info("jdbcName:{}", jdbcName);
		return new ResponseEntity<String>("你好 " + name, HttpStatus.OK);
	}
}
