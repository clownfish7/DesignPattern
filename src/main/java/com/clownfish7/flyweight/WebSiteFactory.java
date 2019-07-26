package com.clownfish7.flyweight;

import java.util.HashMap;

/**
 * @author yzy
 * @classname WebSiteFactory
 * @description TODO
 * @create 2019-07-26 15:38
 */
public class WebSiteFactory {

    private HashMap<String, ConcreateWebSite> map = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new ConcreateWebSite(type));
        }
        return map.get(type);
    }

    public int getWebSiteCount() {
        return map.size();
    }
}
