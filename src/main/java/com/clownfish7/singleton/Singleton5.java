package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 懒汉式(线程安全，同步代码块)  X 不靠谱
public class Singleton5 {

    private static Singleton5 instence;


    private Singleton5(){
    }

    public static Singleton5 getInstence() {
        if (instence == null) {
            synchronized (Singleton5.class){
                instence = new Singleton5();
            }
        }
        return instence;
    }
}
