package com.clownfish7.proxy.cglib;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 16:47
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);

        TeacherDao proxy = (TeacherDao) proxyFactory.getProxyInstance();
        proxy.teach();
        proxy.doSomething("aa", 11, true);

    }
}
