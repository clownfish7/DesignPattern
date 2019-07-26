package com.clownfish7.builder;

/**
 * @author yzy
 * @classname AbstractHouse
 * @description TODO
 * @create 2019-07-25 20:35
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWall();
        roofed();
    }
}
