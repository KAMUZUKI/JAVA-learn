package a_One.k_eleven.a_One.UDP.UDPCommunication;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReciveDemo {
    public static void main(String[] args) throws IOException {
        //�������ն˵�Socket����(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            //����һ�����ݰ������ڽ�������
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //����DatagramSocket����ķ�����������
            ds.receive(dp);
            //�������ݰ������������ڿ���̨��ʾ
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println("�����ǣ�" + str);
            if("886".equals(str)){
                ds.close();
            }
        }
        //�رս��ն�
        
    }
        
}
