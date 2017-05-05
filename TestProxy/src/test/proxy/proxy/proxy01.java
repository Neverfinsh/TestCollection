package test.proxy.proxy;

import test.proxy.biz.GoodsBiz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：针对类的静态代理模式
 * 注意点：
 */
public class proxy01  {

    private GoodsBiz goodsbiz;

    //代理类的具体的方法
    public  void save(){
        System.out.println("代理某个类里面的具体的方法");
    }

    public GoodsBiz getGoodsbiz() {
        return goodsbiz;
    }

    public void setGoodsbiz(GoodsBiz goodsbiz) {
        this.goodsbiz = goodsbiz;
    }
}
