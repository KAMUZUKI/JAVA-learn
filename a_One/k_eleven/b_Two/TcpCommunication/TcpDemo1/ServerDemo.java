package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();

        //��ȡ�������������ݣ�����������ʾ�ڿ���̨
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);

        System.out.println("������:" + data);

        s.close();
        ss.close();
    }
}
