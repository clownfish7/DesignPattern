package com.clownfish7.decorator;

/**
 * @author yzy
 * @classname Milk
 * @description TODO
 * @create 2019-07-26 13:52
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
