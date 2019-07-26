package com.clownfish7.bridge;

/**
 * @author yzy
 * @classname Phone
 * @description TODO
 * @create 2019-07-26 11:25
 */
public abstract class Phone {
    private IBrand brand;
    public Phone(IBrand brand) {
        this.brand = brand;
    }

    protected void call() {
        brand.call();
    }

    protected void close() {
        brand.close();
    }

    protected void open() {
        brand.open();
    }
}
