package com.clownfish7.facade;

/**
 * @author yzy
 * @classname Screen
 * @description TODO
 * @create 2019-07-26 15:05
 */
public class Screen {
    private static Screen instence = new Screen();

    private Screen() {
    }

    public static Screen getInstence() {
        return instence;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }

}
