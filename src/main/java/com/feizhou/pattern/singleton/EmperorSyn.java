package com.feizhou.pattern.singleton;

/**
 * 饿汉
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class EmperorSyn {
    // 初始化时 就加载
    private static final EmperorSyn emperorSyn = new EmperorSyn();

    private EmperorSyn() {

    }

    public synchronized EmperorSyn getInstance() {
        return emperorSyn;
    }

}
