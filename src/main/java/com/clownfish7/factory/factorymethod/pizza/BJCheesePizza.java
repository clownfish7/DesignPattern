package com.clownfish7.factory.factorymethod.pizza;

/**
 * @author yzy
 * @classname BJCheesePizza
 * @description TODO
 * @create 2019-07-25 17:35
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨");
    }
}
