package com.proxy.proxy;

import com.proxy.biz.Goods;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：将方面代码揉入业务中
 * 注意点：
 * 后期重构：
 */
public class Proxy02  implements Goods {
    //实现一个接口的实例；

    private Goods goods;//实现一个接口的实例,实现其中的方法

//无参构造
    public Proxy02() {
    }
//有参构造
    public Proxy02(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void save() {
         System.out.println("开始事物");
          goods.save(); //这个接口的，在业务的接口类中实现。
        System.out.println("事物结束");
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
