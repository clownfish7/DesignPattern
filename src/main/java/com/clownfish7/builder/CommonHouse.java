package com.clownfish7.builder;

/**
 * @author yzy
 * @classname CommonHouse
 * @description TODO
 * @create 2019-07-25 20:38
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("buildBasic for common house");
    }

    @Override
    public void buildWall() {
        System.out.println("buildWall for common house");
    }

    @Override
    public void roofed() {
        System.out.println("roofed for common house");
    }
}
