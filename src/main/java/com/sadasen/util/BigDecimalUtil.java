package com.sadasen.util;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @date 2018年3月23日
 * @author lei.ys
 * @addr company
 * @desc 精确算数
 */
public class BigDecimalUtil implements Serializable {
	
	private static final long serialVersionUID = -4491751433043111041L;
    
    private BigDecimalUtil() {
    }

	/**
     * 提供精确的乘法运算
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static BigDecimal mul(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2);
    }

}
