package com.clownfish7.flyweight;

/**
 * @author yzy
 * @classname ConcreateWebSite
 * @description TODO
 * @create 2019-07-26 15:37
 */
public class ConcreateWebSite extends WebSite {

    private String type = "";

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"  发布形式为： " + type);
    }
}
