package com.clownfish7.builder.improve;

/**
 * @author yzy
 * @classname CommonHouse
 * @description TODO
 * @create 2019-07-25 20:52
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("common house build basic deep 5m");
    }

    @Override
    public void buildWall() {
        System.out.println("common house build wall high 4m");
    }

    @Override
    public void roofed() {
        System.out.println("common house build roofed");
    }
}
