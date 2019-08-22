package com.wangbeauty.studentmanager.exception;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author wangjunwen
 * @version Id: BussinessException.java, v 1.0 2019/8/21 wangjunwen Exp $$
 */
public class BusinessException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 5074685299237630543L;

	@Getter
	private String errorCode;

	public BusinessException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
	}

	public BusinessException(ErrorCodeEnum errorCodeEnum) {
		super(errorCodeEnum.getDesc());
		this.errorCode = errorCodeEnum.getCode();
	}

}
