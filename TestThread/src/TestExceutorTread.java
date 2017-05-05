import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/4/22.
 * 线程池的问题:优缺点？
 */
public class TestExceutorTread {
    /***
     *
     * @param args
     * 使用线程池
     */
    public static void main(String[] args) {

        //最原始的的数据池的问题
        ExecutorService  pool = Executors.newFixedThreadPool(3);//什么意思啊？
          for (int i=0;i<10;i++){//调用了10次的线程问题
              pool.execute(new Runnable() {
                  @Override
                  public void run() {
                      System.out.println("使用线程池的问题");

                  }
              });
          }

//        Executors.newCachedTreadPool().execute(new Runnable){
//            public void run(){
//
//                System.out.println("第二种方式实现");
//            }

        }
    }



