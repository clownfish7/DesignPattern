package com.clownfish7.factory.factorymethod.order;

import com.clownfish7.factory.factorymethod.pizza.BJCheesePizza;
import com.clownfish7.factory.factorymethod.pizza.BJGreekPizza;
import com.clownfish7.factory.factorymethod.pizza.Pizza;


/**
 * @author yzy
 * @classname BJOrderPizza
 * @description TODO
 * @create 2019-07-25 17:43
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
