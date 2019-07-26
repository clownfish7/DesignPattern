package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 饿汉式(静态代码块)
public class Singleton2 {

    //1. 构造器私有化，不能 new
    private Singleton2(){

    }

    //2. 本类内部创建实例
    private static Singleton2 instence;

    static { // 静态代码块中创建实例
        instence = new Singleton2();
    }

    //3. 对外提供一个静态方法返回实例对象
    public static Singleton2 getInstence() {
        return instence;
    }
}
