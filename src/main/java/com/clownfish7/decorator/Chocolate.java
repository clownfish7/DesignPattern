package com.clownfish7.decorator;

/**
 * @author yzy
 * @classname Chocolate
 * @description TODO
 * @create 2019-07-26 13:51
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
