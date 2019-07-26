package com.clownfish7.adapter.objectadapter;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 10:06
 */
public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter(new Voltage220V()));
    }
}
