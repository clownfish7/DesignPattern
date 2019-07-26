package com.clownfish7.templete.improve;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 17:45
 */
public class Client {
    public static void main(String[] args) {
        RedBeanSoyaMilk milk = new RedBeanSoyaMilk();
        milk.make();
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
