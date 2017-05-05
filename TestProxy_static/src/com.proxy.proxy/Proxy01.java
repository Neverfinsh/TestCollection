package com.proxy.proxy;

import com.proxy.biz.GoodsBiz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：针对类进行代理模式,用继承的方法进行代理;
 * 注意点：写无数的代理类和代理的代码；
 * 后期重构：
 */
public class Proxy01 extends GoodsBiz {

    @Override//重写，overload重载

    public void save() {
          System.out.println("事物开始");
          super.save();
          System.out.println("事物结束");
    }
}
