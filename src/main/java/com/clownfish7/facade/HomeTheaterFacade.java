package com.clownfish7.facade;

/**
 * @author yzy
 * @classname HomeTheaterFacade
 * @description TODO
 * @create 2019-07-26 15:07
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstence();
        this.popcorn = Popcorn.getInstence();
        this.projector = Projector.getInstence();
        this.screen = Screen.getInstence();
        this.stereo = Stereo.getInstence();
    }

    public void ready() {
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.up();
        stereo.up();
    }

    public void end() {
        dvdPlayer.off();
        popcorn.off();
        projector.off();
        screen.down();
        stereo.down();
    }

    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        System.out.println("=================");
        facade.end();
    }
}
