package com.clownfish7.iterator;

import java.util.Iterator;

/**
 * @author You
 * @create 2019-07-27 17:07
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position > departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position ++;
        return department;
    }

    @Override
    public void remove() {

    }
}
