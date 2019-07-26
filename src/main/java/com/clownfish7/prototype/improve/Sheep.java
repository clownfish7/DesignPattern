package com.clownfish7.prototype.improve;

/**
 * @author yzy
 * @classname Sheep
 * @description TODO
 * @create 2019-07-25 19:45
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String aa = "喜羊羊";
    public Sheep friend;
    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color +  ", aa=" + aa +"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

