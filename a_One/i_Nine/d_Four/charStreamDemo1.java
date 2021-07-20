package a_One.i_Nine.d_Four;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* 
### �ַ����еı���������⡾Ӧ�á�

- ��ط���

  | ������                                   | ˵��                                               |
  | ---------------------------------------- | -------------------------------------------------- |
  | byte[] getBytes()                        | ʹ��ƽ̨��Ĭ���ַ������� String����Ϊһϵ���ֽ�    |
  | byte[] getBytes(String charsetName)      | ʹ��ָ�����ַ������� String����Ϊһϵ���ֽ�        |
  | String(byte[] bytes)                     | ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������ַ��� |
  | String(byte[] bytes, String charsetName) | ͨ��ָ�����ַ�������ָ�����ֽ������������ַ���     | 
  */
public class charStreamDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "�й�";
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
