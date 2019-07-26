package com.clownfish7.principle.singleresponsibility;

/**
 * @author yzy
 * @classname SingleResponsibility2
 * @description TODO
 * @create 2019-07-25 9:25
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}


//方案2 分析
//1.遵守单一职责原则
//2.这样改动很大，即将类分解，同时修改客户端
//3.改进：直接修改Vehicle，改动的代码比较少 -> 方案3
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在天空上运行...");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行...");
    }
}