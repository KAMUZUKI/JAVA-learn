package a_One.k_eleven.a_One.UDP.UdpMulticast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClinetDemo {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket();
        String s = "hello ×é²¥";
        byte[] bys = s.getBytes();
        
        DatagramPacket dp = new DatagramPacket(bys, bys.length,
            InetAddress.getByName("224.0.1.0"),
            10000);
            
        ds.send(dp);

        ds.close();
    }
}
