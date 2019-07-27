package com.clownfish7.iterator;

import java.util.Iterator;

/**
 * @author You
 * @create 2019-07-27 17:14
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String getName() {
        return "computer";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] = new Department(name,desc);
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
