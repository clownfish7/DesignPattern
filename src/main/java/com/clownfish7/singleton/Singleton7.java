package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 静态内部类
public class Singleton7 {
    private Singleton7(){
    }

    private static class SingletonInstence{
        private static final Singleton7 INSTENCE = new Singleton7();
    }

    public static Singleton7 getInstence() {
        return SingletonInstence.INSTENCE;
    }
}
