package com.clownfish7.composite;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 14:38
 */
public class Client {
    public static void main(String[] args) {
        Department d1 = new Department("d1", "d1");
        Department d2 = new Department("d2", "d2");
        Department d3 = new Department("d3", "d3");

        College c1 = new College("c1", "c1");
        College c2 = new College("c2", "c2");
        College c3 = new College("c3", "c3");

        University u = new University("u1", "u1");

        u.add(c1);
        u.add(c2);
        u.add(c3);

        c1.add(d1);
        c1.add(d2);
        c1.add(d3);

        c2.add(d1);
        c2.add(d2);
        c2.add(d3);

        c3.add(d1);
        c3.add(d2);
        c3.add(d3);

//        u.print();
//        c1.print();
        c2.print();
    }


}
