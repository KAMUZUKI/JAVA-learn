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
        //����������Socket����
        ServerSocket ss = new ServerSocket(10002);

        //�����ͻ������ӣ�����һ����Ӧ��Socket����
        Socket s = ss.accept();
        //��������
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //������д���ı�
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
