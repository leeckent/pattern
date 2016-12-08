package com.feizhou.pattern.proxy.po;

import com.feizhou.pattern.proxy.KindWomen;
import com.feizhou.pattern.proxy.impl.PanJinLian;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    // 动态代理
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
