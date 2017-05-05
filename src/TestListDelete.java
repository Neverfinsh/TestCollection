import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
public class TestListDelete {


    /****
     * 用来测试，list集合中删除的方法
     * @param args
     */
    public static void main(String[] args) {

        
        //加入元素，并且用for循环删除“c”
        List <String>list=new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");



        //测试循环删除“c”的值
         for (int i=0;i<list.size();i++){
             if ("c".equals(list.get(i))){
                 System.out.println("找到了c的值");
                   System.out.println(i);
             }
         }

         //测试删除的值
        for (int i=0;i<list.size();i++){
            if ("c".equals(list.get(i))){
                System.out.println("找到了c的值");
                System.out.println(i);
                    list.remove(i);//删除后，在输出显示
            }
        }

        //好for循环进行删除给一个值
        for(String  str:list){
            if ("c".equals(str)){
                System.out.println("找到了c的值,用for-each删除测试");
                System.out.println(str);
                list.remove(str);//删除后，在输出显示
            }

        }

        //循环输出list集合中的值，删除后在显示；
        for (String  obj:list  ) {
            System.out.print("循环输出list集合中的值");
            System.out.println(obj);
        }

    }
}
