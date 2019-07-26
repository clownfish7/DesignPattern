package com.clownfish7.principle.inversion.improve;

/**
 * @author yzy
 * @classname DependecyInversion
 * @description TODO
 * @create 2019-07-25 10:31
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Persion p = new Persion();
        p.reseive(new Email());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

class Persion{
    public void reseive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}