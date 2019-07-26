package com.clownfish7.adapter.interfaceadapter;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 10:24
 */
public class Client {
    public static void main(String[] args) {
        AbstractIDemoAdapter abstractIDemoAdapter = new AbstractIDemoAdapter() {
            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
        abstractIDemoAdapter.m2();
        abstractIDemoAdapter.m3();
    }
}
