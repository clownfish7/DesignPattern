package com.clownfish7.principle.singleresponsibility;

/**
 * @author yzy
 * @classname SingleResponsibility1
 * @description TODO
 * @create 2019-07-24 16:55
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }


}

//交通工具类
//方式 1
//1.在方式1 run方法中违反了单一职责原则
//2.解决的方案非常简单，根据交通工具的运行方法不同，分解成不同类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行...");
    }
}