package test.proxy.test;

import test.proxy.biz.*;
import test.proxy.proxystatic.Proxy03;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public class Test {
    public static void main(String[] args) {

        //定义的是实现类
        BizImp biz=new BizImp();//具体的业务代码
        ProxyBizImp proxyBIZ=new ProxyBizImp();//方面之事物代码
        LogBiz logbiz=new LogBiz();//方面代码之日志代码


        Proxy03 proxy03=new Proxy03(biz,proxyBIZ);//一级代理模式
        //二级代理
        Proxy03 proxy04=new Proxy03(proxy03,logbiz);
           proxy04.save();
    	}
}
