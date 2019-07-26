package com.clownfish7.factory.factorymethod.order;


import com.clownfish7.factory.factorymethod.pizza.LDCheesePizza;
import com.clownfish7.factory.factorymethod.pizza.LDGreekPizza;
import com.clownfish7.factory.factorymethod.pizza.Pizza;


/**
 * @author yzy
 * @classname LDOrderPizza
 * @description TODO
 * @create 2019-07-25 17:44
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
