package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 懒汉式(线程不安全)
public class Singleton3 {

    //1. 构造器私有化，不能 new
    private Singleton3(){

    }

    //2. 本类内部创建实例
    private static Singleton3 instence;

    //3. 对外提供一个静态方法返回实例对象
    public static Singleton3 getInstence() {
        if (instence == null) {
            instence = new Singleton3();
        }
        return instence;
    }
}
