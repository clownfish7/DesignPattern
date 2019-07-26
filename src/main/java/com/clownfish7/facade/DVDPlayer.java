package com.clownfish7.facade;

/**
 * @author yzy
 * @classname DVDPlayer
 * @description TODO
 * @create 2019-07-26 15:01
 */
public class DVDPlayer {
    private static DVDPlayer instence = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstence() {
        return instence;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd play");
    }

    public void pause() {
        System.out.println("dvd pause");
    }
}
