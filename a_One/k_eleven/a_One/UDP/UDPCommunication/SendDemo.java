package a_One.k_eleven.a_One.UDP.UDPCommunication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.nextLine();

            byte[] bys = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length,
            InetAddress.getByName("192.168.3.52"),12345);
            ds.send(dp);
            
            if ("886".equals(s)) {
                break;
            } 
        }
        sc.close();
        ds.close();
    }
}
