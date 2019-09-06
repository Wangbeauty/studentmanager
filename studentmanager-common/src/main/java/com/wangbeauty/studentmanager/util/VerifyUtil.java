package com.wangbeauty.studentmanager.util;

import com.wangbeauty.studentmanager.exception.BusinessException;
import com.wangbeauty.studentmanager.exception.ErrorCodeEnum;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.expression.ExpressionLanguageGroovyImpl;

import java.util.List;

/**
 *
 * @author wangjunwen
 * @version Id: VerifyUtil.java, v 1.0 2019/8/19 wangjunwen Exp $$
 */

public class VerifyUtil {

    private static Validator validator = new Validator();

    static {
        validator.getExpressionLanguageRegistry().registerExpressionLanguage("groovy",
            new ExpressionLanguageGroovyImpl());
    }

    /**
     * 私有构造方法
     */
    private VerifyUtil() {
    }

    /**
     * oVal参数校验
     *
     * @param object 请求校验参数
     */
    public static void validateObject(Object object) throws BusinessException {
        List<ConstraintViolation> list = validator.validate(object);
        if (null != list && !list.isEmpty()) {
            throw new BusinessException(ErrorCodeEnum.PARAMETER_VALID_ERROR.getCode(), list.get(0).getMessage());
        }
    }
}
