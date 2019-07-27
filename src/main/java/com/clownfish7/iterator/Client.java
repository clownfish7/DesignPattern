package com.clownfish7.iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author You
 * @create 2019-07-27 17:21
 */
public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege(new Department[5]);
        computerCollege.addDepartment("d1", "D1");
        computerCollege.addDepartment("d2", "D1");
        computerCollege.addDepartment("d3", "D1");
        computerCollege.addDepartment("d4", "D1");

        Iterator computerCollegeIterator = computerCollege.createIterator();
        System.out.println(computerCollege.getName());
        while (computerCollegeIterator.hasNext()) {
            Department next = (Department) computerCollegeIterator.next();
            System.out.println(next.toString());
        }

        InformationCollege informationCollege = new InformationCollege(new LinkedList<>());
        informationCollege.addDepartment("d1", "D1");
        informationCollege.addDepartment("d2", "D1");
        informationCollege.addDepartment("d3", "D1");
        informationCollege.addDepartment("d4", "D1");

        Iterator iterator = informationCollege.createIterator();
        System.out.println(informationCollege.getName());
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.toString());
        }
    }
}
