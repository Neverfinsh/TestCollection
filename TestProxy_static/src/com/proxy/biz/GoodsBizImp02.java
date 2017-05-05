package com.proxy.biz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */

public class GoodsBizImp02 implements  Goods {

    @Override
    public void save() {
        System.out.println("接口实现的保存的方法");

    }

    @Override
    public boolean add() {
        System.out.println("add");
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("deleter");
        return false;
    }
}
