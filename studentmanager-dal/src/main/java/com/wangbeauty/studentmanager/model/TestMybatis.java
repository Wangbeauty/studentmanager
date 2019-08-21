package com.wangbeauty.studentmanager.model;

import com.wangbeauty.studentmanager.model.base.BaseDo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 实体类
 *
 * @author wangjunwen
 * @version Id: TestMybatis.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
@Getter
@Setter
@ToString(callSuper = true)
public class TestMybatis extends BaseDo {

	/**
	 * 姓名
	 */
	private String testName;

}
