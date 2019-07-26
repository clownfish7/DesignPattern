package com.clownfish7.factory.absfactory.order;

import com.clownfish7.factory.absfactory.pizza.LDCheesePizza;
import com.clownfish7.factory.absfactory.pizza.LDGreekPizza;
import com.clownfish7.factory.absfactory.pizza.Pizza;

/**
 * @author yzy
 * @classname LDFactory
 * @description TODO
 * @create 2019-07-25 18:46
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName(" ld希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName(" ld奶酪披萨 ");
        }

        return pizza;
    }
}
