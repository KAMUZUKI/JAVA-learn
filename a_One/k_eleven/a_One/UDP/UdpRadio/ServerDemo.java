package a_One.k_eleven.a_One.UDP.UdpRadio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 1. �������ն˵�Socket����(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10000);
        // 2. ����һ�����ݰ������ڽ�������
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3. ����DatagramSocket����ķ�����������
        ds.receive(dp);
        // 4. �������ݰ������������ڿ���̨��ʾ
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        // 5. �رս��ն�
        ds.close();
    }
}
