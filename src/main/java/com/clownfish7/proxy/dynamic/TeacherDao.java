package com.clownfish7.proxy.dynamic;

/**
 * @author yzy
 * @classname TeacherDao
 * @description TODO
 * @create 2019-07-26 16:01
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("teaching~~");
    }

    @Override
    public void doSomething(String aa,int bb,boolean cc) {
        System.out.println("doSomething");
    }
}
