package com.clownfish7.singleton;

/**
 * @author yzy
 * @classname Singleton1
 * @description TODO
 * @create 2019-07-25 15:36
 */

// 双重检查(推荐)
public class Singleton6 {

    private static volatile Singleton6 instence;


    private Singleton6(){
    }

    public static Singleton6 getInstence() {
        if (instence == null) {
            synchronized (Singleton6.class){
                if (instence == null) {
                    instence = new Singleton6();
                }
            }
        }
        return instence;
    }
}
