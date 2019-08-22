package com.wangbeauty.studentmanager.annotation;

import java.lang.annotation.*;

/**
 * @author wangjunwen
 * @version Id: OperateLogger.java, v 1.0 2019/8/22 wangjunwen Exp $$
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperateLogger {

	String desc() default "无描述信息";

	enum OperationType {
		/**
		 * 新增，查询，修改，删除
		 */
		C,R,U,D
	}

	OperationType operationType() default OperationType.R;
}
