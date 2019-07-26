package com.clownfish7.builder.improve;

/**
 * @author yzy
 * @classname HouseBuilder
 * @description TODO
 * @create 2019-07-25 20:50
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
