package com.example.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjectMapperTest {
    private ObjectMapper mapper = new ObjectMapper();
    /*
        1.User对象转json, json转User对象
          json字符串 = {"name":"张三","age":23}
          user对象 = User{name='张三', age=23}
     */
    @Test
    public void test01() throws Exception{
        //User对象转json
        User user = new User("张三",23);
        String json = mapper.writeValueAsString(user);
        System.out.println("json字符串:" + json);
        //json转User对象
        User user2 = mapper.readValue(json,User.class);
        System.out.println("java对象:" + user2);
    }

    /*
      2.map<String,String>转json, json转map<String,String>
      json字符串 = {"姓名":"张三","性别":"男"}
      map对象 = {姓名=张三, 性别=男}
    */

    @Test
    public void test02() throws Exception {
        //map<String,String>转json
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("姓名：","李四");
        hashMap.put("性别","男");
        String json = mapper.writeValueAsString(hashMap);
        System.out.println("hashMap json:" + json);

        //json转map<String,String>
        HashMap<String,String> map = mapper.readValue(json,HashMap.class);
        System.out.println("map:" + map);
    }

    /*
      3.map<String,User>转json, json转map<String,User>
        json字符串 = {"黑马一班":{"name":"张三","age":23},"黑马二班":{"name":"李四","age":24}}
        map对象 = {黑马一班=User{name='张三', age=23}, 黑马二班=User{name='李四', age=24}}
     */

    @Test
    public void test03()throws Exception{
        //map<String,User>转json
        HashMap<String,User> hashMap = new HashMap<>();
        hashMap.put("heima first class",new User("张三",23));
        hashMap.put("heima second class",new User("李四",24));
        String json = mapper.writeValueAsString(hashMap);
        System.out.println("json字符串" + json);

        //json转map<String,User>
        HashMap<String,User> map = mapper.readValue(json,new TypeReference<HashMap<String,User>>(){});
        System.out.println("java对象" + map);
    }

    /*
      4.List<String>转json, json转 List<String>
        json字符串 = ["张三","李四"]
        list对象 = [张三, 李四]
    */

    @Test
    public void test04() throws Exception {
        //List<String>转json
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        String json = mapper.writeValueAsString(list);
        System.out.println("json字符串" + json);

        //json转 List<String>
        ArrayList<String> list2 = mapper.readValue(json,ArrayList.class);
        System.out.println("java对象" + list2);
    }

    /*
      5.List<User>转json, json转List<User>
        json字符串 = [{"name":"张三","age":23},{"name":"李四","age":24}]
        list对象 = [User{name='张三', age=23}, User{name='李四', age=24}]
     */

    @Test
    public void test05() throws Exception{
        //List<User>转json
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("张三",23));
        list.add(new User("李四",24));
        String json = mapper.writeValueAsString(list);
        System.out.println("json对字符串" + json);

        //json转List<User>
        ArrayList<User> list2 = mapper.readValue(json,new TypeReference<ArrayList<User>>(){});
        System.out.println("java对象" + list2);
    }
}

