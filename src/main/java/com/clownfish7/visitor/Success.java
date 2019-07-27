package com.clownfish7.visitor;

/**
 * @author You
 * @create 2019-07-27 16:34
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man is success");
    }

    @Override
    public void getWomanResult(Women man) {
        System.out.println("women is very success");
    }
}
