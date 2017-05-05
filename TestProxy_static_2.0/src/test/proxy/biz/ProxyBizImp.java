package test.proxy.biz;

import test.proxy.biz.ProxyBIZ;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public class ProxyBizImp  implements ProxyBIZ {

    @Override
    public void qian() {
         System.out.println("事物开始");
    }

    @Override
    public void hou() {
        System.out.println("事物结束");

    }

    @Override
    public void error() {
        System.out.println("事物回滚");

    }
}
