package a_One.i_Nine.d_Four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charStreamDemo5 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\test2.txt")); 
        
        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("Hello World" + i);
            bw.flush();;
            bw.newLine();
        }
        //释放资源
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\test2.txt"));
        String line;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }
        br.close();
    }
}
