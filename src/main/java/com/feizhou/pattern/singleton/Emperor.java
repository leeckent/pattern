package com.feizhou.pattern.singleton;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class Emperor {

    private static Emperor emperor = null;

    private Emperor() {

    }

    // 多线程时 单例模式 失败
    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
            System.out.println(" 产生一个新实例 ********** ");
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("I am the emperor: lee");
    }

}
