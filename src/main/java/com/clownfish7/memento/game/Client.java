package com.clownfish7.memento.game;

/**
 * @author You
 * @create 2019-07-27 20:20
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole("yzy", 100, 100);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.save());
        gameRole.setDef(200);
        gameRole.setVit(200);

        System.out.println(gameRole);
        gameRole.getFromMemento(caretaker.getMemento());
        System.out.println(gameRole);
    }
}
