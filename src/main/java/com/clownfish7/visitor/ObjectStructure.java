package com.clownfish7.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author You
 * @create 2019-07-27 16:40
 */
public class ObjectStructure {
    private List<Persion> persions = new LinkedList<>();

    public void attach(Persion persion) {
        persions.add(persion);
    }

    public void detach(Persion persion) {
        persions.remove(persion);
    }

    public void display(Action action) {
        for (Persion persion : persions) {
            persion.accpet(action);
        }
    }
}
