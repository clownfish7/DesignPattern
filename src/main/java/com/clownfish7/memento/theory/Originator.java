package com.clownfish7.memento.theory;

/**
 * @author You
 * @create 2019-07-27 19:57
 */
public class Originator {

    private String state; // 状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
