package com.clownfish7.facade;

/**
 * @author yzy
 * @classname Projector
 * @description TODO
 * @create 2019-07-26 15:04
 */
public class Projector {
    private static Projector instence = new Projector();

    private Projector() {
    }

    public static Projector getInstence() {
        return instence;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector focus");
    }
}
