package com.feizhou.pattern.singleton;

/**
 * 懒汉
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class EmperorSyn5 {
    private static EmperorSyn5 emperorSyn = null;

    private EmperorSyn5() {

    }

    public static synchronized EmperorSyn5 getInstance() {
        if (emperorSyn == null) {
            emperorSyn = new EmperorSyn5();
        }
        return emperorSyn;
    }

}
