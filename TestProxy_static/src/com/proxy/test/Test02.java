package com.proxy.test;

import com.proxy.biz.GoodsBiz02;
import com.proxy.proxy.Proxy02;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public class Test02 {
    public static void main(String[] args) {

        GoodsBiz02 goodsBiz02iz02=new GoodsBiz02();
           Proxy02 proxy02=new Proxy02(goodsBiz02iz02);//有点奇怪啊？
              proxy02.save();

    	}
}
