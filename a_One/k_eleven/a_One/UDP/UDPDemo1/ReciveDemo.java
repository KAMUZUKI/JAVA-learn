package a_One.k_eleven.a_One.UDP.UDPDemo1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReciveDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����(DatagramSocket)
        // DatagramSocket() �������ݱ��׽��ֲ�����󶨵����������ϵ��κο��ö˿�
        DatagramSocket ds = new DatagramSocket();

        //�������ݣ��������ݴ��
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //����һ�����ݰ������ͳ���Ϊ length�����ݰ���ָ�������ϵ�ָ���˿ںš�
        byte[] bys = "hello,udp,������".getBytes();

        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.3.52"),10086);

        System.out.println(InetAddress.getByName("MUZUKI"));
        //����DatagramSocket����ķ�����������
        //void send(DatagramPacket p) �Ӵ��׽��ַ������ݱ���
        ds.send(dp);
        ds.close();
        //�رշ��Ͷ�
        //void close() �رմ����ݱ��׽���
        
    }
}
