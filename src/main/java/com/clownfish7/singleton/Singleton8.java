package com.clownfish7.singleton;


/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 枚举
public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
        instance.say();
      instance2.say();
    }
}

enum Singleton{
    INSTANCE;

    public void say() {
        System.out.println("ok");
    }
}
