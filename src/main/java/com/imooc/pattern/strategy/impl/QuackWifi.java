package com.imooc.pattern.strategy.impl;

import com.imooc.pattern.strategy.QuackStragety;

/**
 * @Author: xlzhang
 * @Description:
 * @Date: Created in 15:55 2018/2/5
 * @Modified By:
 **/
public class QuackWifi implements QuackStragety {
    public void quack() {
        System.out.println("我通过无线电与你通话");
    }
}
