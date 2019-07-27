package com.clownfish7.memento.theory;

/**
 * @author You
 * @create 2019-07-27 19:58
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
