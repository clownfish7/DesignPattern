package com.clownfish7.proxy.dynamic;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 16:18
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        System.out.println(target.getClass());
        ProxyFactory factory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao) factory.getProxyInstance();
        proxyInstance.teach();
        proxyInstance.doSomething("11",11,false);
        System.out.println(proxyInstance.getClass());
    }
}
