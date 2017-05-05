package test.proxy.biz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public interface  ProxyBIZ {
    public void qian();// 事物开始
    public void  hou();// 事物结束
    public void error();//出差了
}
