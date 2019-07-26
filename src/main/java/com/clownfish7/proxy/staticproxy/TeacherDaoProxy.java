package com.clownfish7.proxy.staticproxy;

/**
 * @author yzy
 * @classname TeacherDaoProxy
 * @description TODO
 * @create 2019-07-26 16:02
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy start~~");
        target.teach();
        System.out.println("proxy end~~");
    }
}
