/**
 * Created by Administrator on 2017/4/22.
 */

  public  class TestTreadRunbale implements  Runnable {//实现runable的接口实现线程的方式

    @Override
    public void run() {
        System.out.println("第二种方式实现线程的");
    }

    public static void main(String[] args) {
        System.out.println("第二种方式实现");
          TestTreadRunbale thread2=new TestTreadRunbale();
             new Thread(thread2,"新线程2").start();//这个是什么东东？

    	}
}
