package com.clownfish7.visitor;

/**
 * @author You
 * @create 2019-07-27 16:35
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man is fail");
    }

    @Override
    public void getWomanResult(Women man) {
        System.out.println("women is fail");
    }
}
