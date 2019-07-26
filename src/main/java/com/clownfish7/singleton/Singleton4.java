package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 懒汉式(线程安全，同步方法)
public class Singleton4 {

    //1. 构造器私有化，不能 new
    private Singleton4(){

    }

    //2. 本类内部创建实例
    private static Singleton4 instence;

    //3. 对外提供一个静态方法返回实例对象
    public synchronized static Singleton4 getInstence() {
        if (instence == null) {
            instence = new Singleton4();
        }
        return instence;
    }
}
