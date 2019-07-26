package com.clownfish7.factory.absfactory.order;

import com.clownfish7.factory.absfactory.pizza.Pizza;

/**
 * @author yzy
 * @classname AbsFactory
 * @description TODO
 * @create 2019-07-25 18:45
 */
public interface AbsFactory {

    Pizza createPizza(String orderType);
}
