package com.wangbeauty.studentmanager.intercept;

import com.wangbeauty.studentmanager.annotation.OperateLogger;
import com.wangbeauty.studentmanager.model.base.BaseReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangjunwen
 * @version Id: LogAspect.java, v 1.0 2019/8/22 wangjunwen Exp $$
 */

@Aspect
@Slf4j
@Component
public class LogAspect {

	@Pointcut("@annotation(com.wangbeauty.studentmanager.annotation.OperateLogger)")
	public void loggerAspect(){

	}

	@Around(value = "loggerAspect()")
	public Object loggerAround(ProceedingJoinPoint joinPoint) throws ClassNotFoundException {
		String classType = joinPoint.getTarget().getClass().getName();
		Class<?> clazz = Class.forName(classType);
		String requestUrl = clazz.getSimpleName() + "." + joinPoint.getSignature().getName();
		/** 获取执行方法上的注解 **/
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		OperateLogger annotation = signature.getMethod().getAnnotation(OperateLogger.class);

		/** 获取执行方法的参数列表 **/
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		BaseReqDTO baseReqDTO = new BaseReqDTO();
		for (Object param : args) {
			if (param instanceof BaseReqDTO) {
				baseReqDTO = (BaseReqDTO)param;
				break;
			}
		}

		Object result = null;
		try {
			MDC.put("TRACE_LOG_ID", baseReqDTO.getTraceLogId());
			result = joinPoint.proceed();
			MDC.clear();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return result;
	}
}
