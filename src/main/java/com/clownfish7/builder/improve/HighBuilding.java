package com.clownfish7.builder.improve;

/**
 * @author yzy
 * @classname HighBuilding
 * @description TODO
 * @create 2019-07-25 20:54
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("highbuilding build basic 100m");
    }

    @Override
    public void buildWall() {
        System.out.println("highbuilding build wall 100m");
    }

    @Override
    public void roofed() {
        System.out.println("highbuilding build roofed");
    }
}
