package com.clownfish7.factory.simplefactory.pizzstore.pizza;

/**
 * @author yzy
 * @classname GreekPizza
 * @description TODO
 * @create 2019-07-25 16:28
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备 greek ..");
    }
}
