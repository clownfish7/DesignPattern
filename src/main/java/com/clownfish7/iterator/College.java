package com.clownfish7.iterator;

import java.util.Iterator;

/**
 * @author You
 * @create 2019-07-27 17:13
 */
public interface College {
    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator createIterator();
}
