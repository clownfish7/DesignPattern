package com.clownfish7.templete;

/**
 * @author yzy
 * @classname SoyaMilk
 * @description TODO
 * @create 2019-07-26 17:41
 */
public abstract class SoyaMilk {

    protected final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    protected final void select() {
        System.out.println("1. 选料");
    }

    //浸泡
    protected final void soak() {
        System.out.println("第三步， 黄豆和配料开始浸泡， 需要3小时 ");
    }

    protected final void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎  ");
    }

    abstract void addCondiments();
}
