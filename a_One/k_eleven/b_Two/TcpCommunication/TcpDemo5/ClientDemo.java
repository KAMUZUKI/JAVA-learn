package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.3.52",10004);

        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
       // os.close();������������,�ᵼ������socket���޷�ʹ��
        socket.shutdownOutput();//�����ر������.��дһ���������,��socketû���κ�Ӱ��
        
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        os.close();
        socket.close();
    }
}
