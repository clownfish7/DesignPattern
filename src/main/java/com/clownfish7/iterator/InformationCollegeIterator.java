package com.clownfish7.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author You
 * @create 2019-07-27 17:10
 */
public class InformationCollegeIterator implements Iterator {

    List<Department> departmentList;
    int index = -1;

    public InformationCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
