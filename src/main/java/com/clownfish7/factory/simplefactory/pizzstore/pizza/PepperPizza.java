package com.clownfish7.factory.simplefactory.pizzstore.pizza;

/**
 * @author yzy
 * @classname PepperPizza
 * @description TODO
 * @create 2019-07-25 16:39
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 pepper ..");
    }
}
