package a_One.i_Nine.e_five.propertiesDemo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propertiesDemo1 {
    public static void main(String[] args) {

        //�������϶���
        //Properties<String,String> prop = new Properties<String,String>(); //����
        Properties prop = new Properties();

        //�洢Ԫ��
        prop.put("����", 23);
        prop.put("����", 24);
        prop.put("����", 25);

        //��������
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
