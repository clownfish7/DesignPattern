package com.clownfish7.bridge;

/**
 * @author yzy
 * @classname FoldedPhone
 * @description TODO
 * @create 2019-07-26 11:28
 */
public class FoldedPhone extends Phone {


    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        System.out.println("folded");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("folded");
        super.close();
    }

    @Override
    protected void open() {
        System.out.println("folded");
        super.open();
    }
}
