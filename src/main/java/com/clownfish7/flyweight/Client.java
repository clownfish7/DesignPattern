package com.clownfish7.flyweight;

/**
 * @author yzy
 * @classname Client
 * @description TODO
 * @create 2019-07-26 15:42
 */
public class Client {
    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite wechat = factory.getWebSiteCategory("wechat");
        WebSite web = factory.getWebSiteCategory("web");
        WebSite sina = factory.getWebSiteCategory("sina");

        User u1 = new User();
        u1.setName("u1");
        wechat.use(u1);
        web.use(u1);
        sina.use(u1);

        WebSite wechat1 = factory.getWebSiteCategory("wechat");
        wechat1.use(u1);
        System.out.println(wechat.hashCode());
        System.out.println(wechat.hashCode());
        System.out.println(wechat == wechat1);
        System.out.println(factory.getWebSiteCount());
    }
}
