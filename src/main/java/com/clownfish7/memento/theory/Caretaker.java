package com.clownfish7.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author You
 * @create 2019-07-27 20:01
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
