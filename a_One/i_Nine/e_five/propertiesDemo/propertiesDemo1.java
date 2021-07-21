package a_One.i_Nine.e_five.propertiesDemo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propertiesDemo1 {
    public static void main(String[] args) {

        //创建集合对象
        //Properties<String,String> prop = new Properties<String,String>(); //错误
        Properties prop = new Properties();

        //存储元素
        prop.put("张三", 23);
        prop.put("李四", 24);
        prop.put("王五", 25);

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("===============================");

        Set<Map.Entry<Object,Object>> entries = prop.entrySet();
        for (Map.Entry<Object,Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " " + value);
        } 
    }
}
