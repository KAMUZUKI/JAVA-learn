package a_One.k_eleven.a_One.UDP.UdpMulticast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        // 1. 创建接收端Socket对象(MulticastSocket)
        MulticastSocket ms = new MulticastSocket(10000);


        // 2. 创建一个箱子,用于接收数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3. 把当前计算机绑定一个组播地址,表示添加到这一组中.
        ms.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.0"),10000),NetworkInterface.getByName("172.31.164.11"));
        // 4. 将数据接收到箱子中
        ms.receive(dp);
        // 5. 解析数据包,并打印数据
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        // 6. 释放资源
        ms.close();

    }
}
