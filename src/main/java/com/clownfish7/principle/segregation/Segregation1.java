package com.clownfish7.principle.segregation;

/**
 * @author yzy
 * @classname Segregation1
 * @description TODO
 * @create 2019-07-25 10:04
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

//接口
interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}


interface Interface3{
    void operation4();
    void operation5();
}


class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B: operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B: operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B: operation3");
    }

}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D: operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D: operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D: operation5");
    }
}

class A { // A 通过接口Interface1 依赖使用 B 类 使用到1,2,3方法
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }
}

class C { // C  通过接口Interface1 依赖使用 D 类 使用到1,4,5方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend4(Interface3 interface1) {
        interface1.operation4();
    }
    public void depend5(Interface3 interface1) {
        interface1.operation5();
    }
}