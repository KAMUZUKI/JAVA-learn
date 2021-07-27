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
        //����������Socket����
        ServerSocket ss = new ServerSocket(10003);

        //�����ͻ������ӣ�����һ����Ӧ��Socket����
        Socket s = ss.accept();
        //��������
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //������д���ı�
        BufferedWriter bw = new BufferedWriter(new 
        FileWriter("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo4\\copy.txt")); 
       
        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("�ļ��ϴ��ɹ�");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close(); 

    } 
}
