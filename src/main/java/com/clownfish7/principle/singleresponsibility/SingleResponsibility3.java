package com.clownfish7.principle.singleresponsibility;

/**
 * @author yzy
 * @classname SingleResponsibility3
 * @description TODO
 * @create 2019-07-25 9:30
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("游轮");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle+"在天空上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle+"在水上运行...");
    }
}