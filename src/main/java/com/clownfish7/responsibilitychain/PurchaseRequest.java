package com.clownfish7.responsibilitychain;

/**
 * @author You
 * @create 2019-07-28 0:11
 */
public class PurchaseRequest {

    private int type = 0;
    private int num = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, int num, float price, int id) {
        this.type = type;
        this.num = num;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
