package com.clownfish7.bridge;

/**
 * @author yzy
 * @classname UpRightPhone
 * @description TODO
 * @create 2019-07-26 11:28
 */
public class UpRightPhone extends Phone {


    public UpRightPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        System.out.println("upRight");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("upRight");
        super.close();
    }

    @Override
    protected void open() {
        System.out.println("upRight");
        super.open();
    }
}
