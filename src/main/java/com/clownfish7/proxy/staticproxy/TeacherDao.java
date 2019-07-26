package com.clownfish7.proxy.staticproxy;

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
}
