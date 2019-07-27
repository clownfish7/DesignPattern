package com.clownfish7.visitor;

/**
 * @author You
 * @create 2019-07-27 16:42
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure result = new ObjectStructure();
        Man m1 = new Man();
        Women w1 = new Women();
        Success success = new Success();
        Fail fail = new Fail();
        m1.accpet(success);
        w1.accpet(fail);

        result.attach(w1);
        result.attach(m1);

        result.display(success);
    }
}
