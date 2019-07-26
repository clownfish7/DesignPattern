package com.clownfish7.factory.factorymethod.pizza;

/**
 * @author yzy
 * @classname BJGreekPizza
 * @description TODO
 * @create 2019-07-25 17:35
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦希腊披萨");
        System.out.println("伦敦希腊披萨");
    }
}
