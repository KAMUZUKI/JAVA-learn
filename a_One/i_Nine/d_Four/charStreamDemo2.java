package a_One.i_Nine.d_Four;

import java.io.FileWriter;
import java.io.IOException;

/* 
��Ա����

| ������                                    | ˵��                 |
| ----------------------------------------- | -------------------- |
| void   write(int c)                       | дһ���ַ�           |
| void   write(char[] cbuf)                 | д��һ���ַ�����     |
| void write(char[] cbuf, int off, int len) | д���ַ������һ����  |
| void write(String str)                    | дһ���ַ���        |
| void write(String str, int off, int len)  | дһ���ַ�����һ���� | 
*/
public class charStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\test.txt");
        fw.write(97);
        fw.write("\r\n");
        fw.flush();
        
        char[] chars = {97,98,99,100,101};
        fw.write(chars);
        fw.write("\r\n");
        
        fw.write(chars, 0, 3);
        fw.write("\r\n");
        
        String str = "abcdef";
        fw.write(str);
        fw.write("\r\n");

        fw.write(str, 1, 3);
        fw.write("\r\n");
        fw.close();
    }
}
