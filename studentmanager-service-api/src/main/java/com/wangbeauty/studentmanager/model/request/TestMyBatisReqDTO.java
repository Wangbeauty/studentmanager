package com.wangbeauty.studentmanager.model.request;

import com.wangbeauty.studentmanager.model.base.BaseReqDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.sf.oval.constraint.Assert;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * @author wangjunwen
 * @version Id: TestMyBatisReqDTO.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */

@Getter
@Setter
@ToString(callSuper = true)
public class TestMyBatisReqDTO extends BaseReqDTO {

	@NotNull(message = "名称不能为空")
	@NotBlank(message = "名称不能为空")
	private String testName;

//	/**
//	 * 拓展员工号
//	 */
//	@Assert(
//			expr = "_value == null && _this.assignStaffNo != null || _value != null",
//			lang = "groovy",
//			message = "拓展员工号为空时，认领员工号不能为空"
//	)
//	@NotBlank(message = "拓展员工号不能为空")
//	private String recommendNo;
//
//	/**
//	 * 认领员工号
//	 */
//	@Assert(
//			expr = "_value == null && _this.recommendNo != null || _value != null",
//			lang = "groovy",
//			message = "认领员工号为空时，拓展员工号不能为空"
//	)
//	@NotBlank(message = "认领员工号不能为空")
//	private String assignStaffNo;
}
