package test.proxy.proxystatic;

import test.proxy.biz.BIZ;
import test.proxy.biz.LogBiz;
import test.proxy.biz.ProxyBIZ;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：代理就是把方面代码揉入业务代码中，首先把业务的接口，
 * 注意点：
 * 后期重构：
 */
public class Proxy03 implements BIZ {

    private BIZ biz;// 业务的代码
    private ProxyBIZ  proxybiz;//方面代码（包括的日志，事物，安全模式）只要实现这个方面代码的接口


    // 无参构造
    public Proxy03() {
    }
  //有参构造
    public Proxy03(BIZ biz, ProxyBIZ proxybiz) {
        this.biz = biz;
        this.proxybiz = proxybiz;

    }

    @Override
    public void save() {
        try {
            proxybiz.qian();
            biz.save();
            proxybiz.hou();

        }catch (Exception EX){
            System.out.println("出现运行时异常");
            EX.printStackTrace();//打印异常信息
            proxybiz.error();
        }

    }
}
