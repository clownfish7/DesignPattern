package com.clownfish7.adapter.objectadapter;

/**
 * @author yzy
 * @classname Phone
 * @description TODO
 * @create 2019-07-26 10:03
 */
public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}

