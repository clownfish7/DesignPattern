package com.clownfish7.adapter.classadapter;

/**
 * @author yzy
 * @classname Voltage220V
 * @description TODO
 * @create 2019-07-26 10:03
 */
//被适配的类
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
