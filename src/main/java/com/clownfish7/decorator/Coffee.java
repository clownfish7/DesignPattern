package com.clownfish7.decorator;

/**
 * @author yzy
 * @classname Coffee
 * @description TODO
 * @create 2019-07-26 13:44
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
