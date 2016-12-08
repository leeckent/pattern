package com.feizhou.pattern.strategy.impl;

import com.feizhou.pattern.strategy.IStrategy;

/**
 * 算法实现
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class GivenGreenLight implements IStrategy {

    public void operate() {
        System.out.println("The second step: given green light!!!");
    }
}
