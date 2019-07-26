package com.clownfish7.bridge;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 11:29
 */
public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new Huawei());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        Phone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}
