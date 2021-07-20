package a_One.i_Nine.d_Four;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* 
### 字符串中的编码解码问题【应用】

- 相关方法

  | 方法名                                   | 说明                                               |
  | ---------------------------------------- | -------------------------------------------------- |
  | byte[] getBytes()                        | 使用平台的默认字符集将该 String编码为一系列字节    |
  | byte[] getBytes(String charsetName)      | 使用指定的字符集将该 String编码为一系列字节        |
  | String(byte[] bytes)                     | 使用平台的默认字符集解码指定的字节数组来创建字符串 |
  | String(byte[] bytes, String charsetName) | 通过指定的字符集解码指定的字节数组来创建字符串     | 
  */
public class charStreamDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "中国";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String ss = new String(bytes);
        System.out.println(ss);
        String ss2 = new String(bytes2,"GBK");
        System.out.println(ss2);
    }   
}
