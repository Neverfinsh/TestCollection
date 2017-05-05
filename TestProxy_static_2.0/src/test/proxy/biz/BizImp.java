package test.proxy.biz;

/**
 * Created by Lw  primary
 * 2017/5/4
 * 功能描述：
 * 注意点：
 * 后期重构：
 */
public class BizImp implements  BIZ {
    @Override
    public void save() {
        System.out.println("业务代码2.0");

       // 抛出一个runtimeexception运行时异常
        throw  new  RuntimeException("自定义的异常信息");
    }

}
