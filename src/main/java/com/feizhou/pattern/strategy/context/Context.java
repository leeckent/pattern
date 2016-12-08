package com.feizhou.pattern.strategy.context;

import com.feizhou.pattern.strategy.IStrategy;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
