package com.wangbeauty.studentmanager.model.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 *     基础模型DO
 * </p>
 * user: liujun Date:2018/01/14 ProjectName: agentmanager Version:1.0
 * @author liujun
 */
@Getter
@Setter
@ToString(callSuper = true)
public class BaseDo {

    /**
     * 数据库主键（系统ID）
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 最后更新人
     */
    private String updatedBy;

}
