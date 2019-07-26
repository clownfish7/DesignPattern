package com.clownfish7.factory.absfactory.pizza;

/**
 * @author yzy
 * @classname BJCheesePizza
 * @description TODO
 * @create 2019-07-25 17:35
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨");
    }
}
