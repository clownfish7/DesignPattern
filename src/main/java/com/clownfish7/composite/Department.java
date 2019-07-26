package com.clownfish7.composite;

/**
 * @author yzy
 * @classname Department
 * @description TODO
 * @create 2019-07-26 14:25
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("----Department----"+getName()+"--------");
    }
}
