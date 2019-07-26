package com.clownfish7.factory.factorymethod.pizza;

/**
 * @author yzy
 * @classname Pizza
 * @description TODO
 * @create 2019-07-25 16:23
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println("bake..");
    }

    public void cut(){
        System.out.println("cut..");
    }

    public void box(){
        System.out.println("box..");
    }

    public void setName(String name) {
        this.name = name;
    }
}
