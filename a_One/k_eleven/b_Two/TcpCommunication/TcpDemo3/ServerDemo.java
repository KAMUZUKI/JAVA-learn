package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10002);

        //监听客户端连接，返回一个对应的Socket对象
        Socket s = ss.accept();
        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本
        BufferedWriter bw = new BufferedWriter(new 
        FileWriter("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo3\\copy.java")); 
       
        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        ss.close();
        bw.close();

    } 
}
