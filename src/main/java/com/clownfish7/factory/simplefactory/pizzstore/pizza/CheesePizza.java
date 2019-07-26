package com.clownfish7.factory.simplefactory.pizzstore.pizza;

/**
 * @author yzy
 * @classname CheesePizza
 * @description TODO
 * @create 2019-07-25 16:27
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备 cheese ..");
    }
}
