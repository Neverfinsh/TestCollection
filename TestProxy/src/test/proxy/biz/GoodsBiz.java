package test.proxy.biz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：模拟goodsbiz的业务的功能，针对类的静态代理模式的开发
 * 注意点：类的代理模式，用java继承的方法，揉入方面的代码
 * 后期重构：
 */
public class GoodsBiz {

//    保存的一个业务的功能
    public void save(){
        System.out.println("进行保存的业务功能");
    }
}
