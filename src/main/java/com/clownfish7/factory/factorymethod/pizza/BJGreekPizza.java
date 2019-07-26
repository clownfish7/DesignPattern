package com.clownfish7.factory.factorymethod.pizza;

/**
 * @author yzy
 * @classname BJGreekPizza
 * @description TODO
 * @create 2019-07-25 17:35
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("北京希腊披萨");
    }
}
