package com.wangbeauty.studentmanager.model.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author wangjunwen
 * @version Id: TestMyBatisReqDTO.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */
@Getter
@Setter
@ToString(callSuper = true)
public class BaseReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -1772352639550115701L;

}