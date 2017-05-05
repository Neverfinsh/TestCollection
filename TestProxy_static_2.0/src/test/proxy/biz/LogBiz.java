package test.proxy.biz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public class LogBiz  implements  ProxyBIZ{//日志代码实现了方面代码

    @Override
    public void qian() {
        System.out.println("开始记录日志");
    }

    @Override
    public void hou() {

    }

    @Override
    public void error() {

    }
}
