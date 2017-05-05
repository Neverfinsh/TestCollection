package test.proxy.test;

import test.proxy.biz.GoodsBiz;
import test.proxy.proxy.proxy01;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：模拟一下什么是代理
 * 注意点：用setter方法进行注入的模式；
 * 后期重构：注意培养一下自己的 编码风格，最好一眼能够认出来。
 */
public class Test01 {
    public static void main(String[] args) {
        proxy01  test1= new proxy01();
        GoodsBiz biz=new GoodsBiz();
//        不同的功能点进行分开；空行；

        test1.setGoodsbiz(biz);//进行动态代理，用set的方法进行注入
        test1.save();

    	}
}
