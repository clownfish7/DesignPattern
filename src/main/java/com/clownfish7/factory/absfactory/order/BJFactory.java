package com.clownfish7.factory.absfactory.order;

import com.clownfish7.factory.absfactory.pizza.BJCheesePizza;
import com.clownfish7.factory.absfactory.pizza.BJGreekPizza;
import com.clownfish7.factory.absfactory.pizza.Pizza;

/**
 * @author yzy
 * @classname BJFactory
 * @description TODO
 * @create 2019-07-25 18:46
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName(" bj希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName(" bj奶酪披萨 ");
        }

        return pizza;
    }
}
