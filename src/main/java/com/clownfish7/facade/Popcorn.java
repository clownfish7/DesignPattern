package com.clownfish7.facade;

/**
 * @author yzy
 * @classname Popcorn
 * @description TODO
 * @create 2019-07-26 15:03
 */
public class Popcorn {
    private static Popcorn instence = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstence() {
        return instence;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn pop");
    }

}
