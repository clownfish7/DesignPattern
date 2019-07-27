package com.clownfish7.visitor;

/**
 * @author You
 * @create 2019-07-27 16:34
 */
public class Man extends Persion {
    @Override
    public void accpet(Action action) {
        action.getManResult(this);
    }
}
