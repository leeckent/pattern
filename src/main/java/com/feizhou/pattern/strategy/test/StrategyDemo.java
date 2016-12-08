package com.feizhou.pattern.strategy.test;

import com.feizhou.pattern.strategy.context.Context;
import com.feizhou.pattern.strategy.impl.BackDoor;
import com.feizhou.pattern.strategy.impl.BlockEnemy;
import com.feizhou.pattern.strategy.impl.GivenGreenLight;

/**
 * 测试类
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context;

        System.out.println("************ start *************");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("************ second *************");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("************ third *************");
        context = new Context(new BlockEnemy());
        context.operate();
    }

}
