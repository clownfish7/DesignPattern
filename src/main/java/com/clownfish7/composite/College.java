package com.clownfish7.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yzy
 * @classname College
 * @description TODO
 * @create 2019-07-26 14:25
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> list = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("----College----"+getName()+"--------");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }
}
