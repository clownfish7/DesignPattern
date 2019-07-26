package com.clownfish7.factory.absfactory.pizza;

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
        System.out.println("bake.."+name);
    }

    public void cut(){
        System.out.println("cut.."+name);
    }

    public void box(){
        System.out.println("box.."+name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
