import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Administrator on 2017/4/16.
 */
public class TestHashMap {
    public static void main(String[] args) {
             Map <String,String> map=new HashMap<String,String>()  ;
                   map.put("a","a");
                   map.put("a","a");
                   map.put("b","b");
                   map.put("c","v");
            System.out.println("map结合的个数"+map.size());
               System.out.println("测试get的方法"+map.get("a"));


        //进行迭代的要求；
          for (String in:map.keySet()  ) {
              System.out.println("第一种方法进行迭代"+map.get(in));

        }

        //进行大容量进行数据进行提示；
        System.out.println("第三种方法进行求值，好处是可以求键和值");
          for (Map.Entry<String,String> entry:map.entrySet()){//什么意思这个东西
              System.out.print("键"+entry.getKey());
                 System.out.println("值"+entry.getValue());

          }

    	}
}
