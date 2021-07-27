package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientDemo {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //�����ͻ���Socke����
        Socket s = new Socket("192.168.3.52",10002);

        //��װ�ı��ļ�����
        BufferedReader br = new BufferedReader(new 
        FileReader("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo3\\test.java"));
        //��װ�����д����
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }   

        br.close();
        s.close();
    }
}
