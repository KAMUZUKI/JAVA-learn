package a_One.k_eleven.a_One.UDP.UdpRadio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 1. �������Ͷ�Socket����(DatagramSocket)
      DatagramSocket ds = new DatagramSocket();
      // 2. �����洢���ݵ�����,���㲥��ַ��װ��ȥ
      String s = "�㲥 hello";
      byte[] bytes = s.getBytes();
      InetAddress address = InetAddress.getByName("255.255.255.255");
      int port = 10000;
      DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
      // 3. ��������
      ds.send(dp);
      // 4. �ͷ���Դ
      ds.close();
  }
}
