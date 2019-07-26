package com.clownfish7.factory.absfactory.order;

/**
 * @author yzy
 * @classname PizzaStore
 * @description TODO
 * @create 2019-07-25 18:50
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
