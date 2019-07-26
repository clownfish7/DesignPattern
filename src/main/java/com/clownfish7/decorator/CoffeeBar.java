package com.clownfish7.decorator;

/**
 * @author yzy
 * @classname CoffeeBar
 * @description TODO
 * @create 2019-07-26 13:53
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.getDes());
        System.out.println(longBlack.cost());

        Drink milk = new Milk(longBlack);
        System.out.println(milk.des);
        System.out.println(milk.cost());
    }
}
