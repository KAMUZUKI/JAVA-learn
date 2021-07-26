package a_One.k_eleven.a_One.UDP.UDPDemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SendDemo {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket(10086); 
        
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

        System.out.println("接收的数据是：" + new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
