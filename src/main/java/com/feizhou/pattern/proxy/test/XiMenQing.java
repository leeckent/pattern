package com.feizhou.pattern.proxy.test;

import com.feizhou.pattern.proxy.impl.JiaShi;
import com.feizhou.pattern.proxy.po.WangPo;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class XiMenQing {

    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        wangPo = new WangPo(new JiaShi());
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }

}
