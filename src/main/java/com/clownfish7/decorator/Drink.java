package com.clownfish7.decorator;

/**
 * @author yzy
 * @classname Drink
 * @description TODO
 * @create 2019-07-26 13:42
 */
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
