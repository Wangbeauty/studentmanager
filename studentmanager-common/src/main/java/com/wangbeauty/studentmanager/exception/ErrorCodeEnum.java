package com.wangbeauty.studentmanager.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author wangjunwen
 * @version Id: ErrorCodeEnum.java, v 1.0 2019/8/21 wangjunwen Exp $$
 */
@Getter
@ToString
@AllArgsConstructor
public enum ErrorCodeEnum {

	/**
	 * 成功
	 */
	SUCCESS("SUCCESS", "成功"),

	/**
	 * oVal参数校验失败
	 */
	PARAMETER_VALID_ERROR("PARAMETER_VALID_ERROR", "参数校验失败");

	private String code;

	private String desc;
}
