package com.clownfish7.facade;

/**
 * @author yzy
 * @classname Stereo
 * @description TODO
 * @create 2019-07-26 15:06
 */
public class Stereo {
    private static Stereo instence = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstence() {
        return instence;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }
}
