package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo{
    public static void main(String[] args) throws IOException{
        //�����ͻ��˵�Socket����(Socket)
        //Socket(String host, int port) �������׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
        Socket s = new Socket("192.168.3.52",10001);

        //��ȡ�������д����
        //OutputStream getOutputStream() ���ش��׽��ֵ������
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,������".getBytes());

        //�ͷ���Դ
        s.close();
    }
}
