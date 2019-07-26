package com.clownfish7.proxy.staticproxy;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 16:04
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
