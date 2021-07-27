package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10003);

        //监听客户端连接，返回一个对应的Socket对象
        Socket s = ss.accept();
        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本
        BufferedWriter bw = new BufferedWriter(new 
        FileWriter("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo4\\copy.txt")); 
       
        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close(); 

    } 
}
