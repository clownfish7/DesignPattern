package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 饿汉式(静态变量)
public class Singleton1 {

    // 本类内部创建实例
    private static final Singleton1 instence = new Singleton1();

    // 构造器私有化，不能 new
    private Singleton1(){
    }

    // 对外提供一个静态方法返回实例对象
    public static Singleton1 getInstence() {
        return instence;
    }
}
