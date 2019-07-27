package com.clownfish7.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author You
 * @create 2019-07-27 17:20
 */
public class InformationCollege implements College {

    private List<Department> departmentList;


    public InformationCollege(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public String getName() {
        return "information";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departmentList);
    }
}
