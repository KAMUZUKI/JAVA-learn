package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientDemo {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //创建客户端Socke对象
        Socket s = new Socket("192.168.3.52",10003);

        //封装文本文件数据
        BufferedReader br = new BufferedReader(new 
        FileReader("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo4\\test.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }   

        s.shutdownOutput();
        BufferedReader brClicent = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClicent.readLine();
        System.out.println("服务器反馈：" + data);
        
        br.close();
        s.close();
    }
}
