package com.clownfish7.principle.liskov.improve;

/**
 * @author yzy
 * @classname Liskov
 * @description TODO
 * @create 2019-07-25 11:21
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));
        System.out.println(a.fun1(1, 8));

        B b = new B();
        System.out.println(b.fun1(11, 3));
        System.out.println(b.fun1(11, 3));
        System.out.println(b.fun2(11, 3));
    }
}

class A {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    @Override
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

}


