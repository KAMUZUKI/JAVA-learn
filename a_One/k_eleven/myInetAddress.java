package a_One.k_eleven;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class myInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("MUZUKI");

        String name = address.getHostName();
        String ip = address.getHostAddress();

        System.out.println("������" + name);
        System.out.println("IP��ַ" + ip);

    }
}
