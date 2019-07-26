package com.clownfish7.builder.improve;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-25 20:58
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house = director.constructHouse();

        HighBuilding highBuilding = new HighBuilding();
        director = new HouseDirector(highBuilding);
        house = director.constructHouse();

    }
}
