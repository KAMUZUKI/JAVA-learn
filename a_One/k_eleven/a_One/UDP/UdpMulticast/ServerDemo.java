package a_One.k_eleven.a_One.UDP.UdpMulticast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        // 1. �������ն�Socket����(MulticastSocket)
        MulticastSocket ms = new MulticastSocket(10000);


        // 2. ����һ������,���ڽ�������
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3. �ѵ�ǰ�������һ���鲥��ַ,��ʾ��ӵ���һ����.
        ms.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.0"),10000),NetworkInterface.getByName("172.31.164.11"));
        // 4. �����ݽ��յ�������
        ms.receive(dp);
        // 5. �������ݰ�,����ӡ����
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        // 6. �ͷ���Դ
        ms.close();

    }
}
