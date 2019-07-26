package com.clownfish7.principle.inversion;

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

class Email{
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

/**
 * 完成Persion接受消息的过程
 * 方案 1 分析
 * 1. 简单，比较容易想到
 * 2. 如果我门获取的对象是微信，短信等，则新增类，同时 Persion 也要新增方法
 * 3. 解决思路：引入一个抽象的接口 IReceiver ，表示接收者，这样 Persion 类与 IReceiver 接口发生依赖
 *    因为 Email ，Wechat ，等都属于接收的范围，他们各自实现 IReceiver 接口就行，这样符合依赖倒转原则
 */
class Persion{
    public void reseive(Email email) {
        System.out.println(email.getInfo());
    }
}