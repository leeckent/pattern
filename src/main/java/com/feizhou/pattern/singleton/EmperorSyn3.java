package com.feizhou.pattern.singleton;

/**
 * 静态内部类
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class EmperorSyn3 {

    private static class Single {
        private static EmperorSyn3 instance = new EmperorSyn3();
    }

    private EmperorSyn3() {

    }

    // 使用时才加载
    public static EmperorSyn3 getInstance() {
        return Single.instance;
    }

}
