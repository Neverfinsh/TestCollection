/**
 * Created by Administrator on 2017/4/22.
 * 线程的几种实现方式；
 */

class  TestThreadImp  extends  Thread{
    public  void run(){
        System.out.println("第一种方式实现线程的");
    }


//
    public static void main(String[] args) {
        System.out.println("第一种方式实现");
           new TestThreadImp().start();
    	}
}