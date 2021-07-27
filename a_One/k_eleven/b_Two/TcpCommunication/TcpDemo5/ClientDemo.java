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
       // os.close();如果在这里关流,会导致整个socket都无法使用
        socket.shutdownOutput();//仅仅关闭输出流.并写一个结束标记,对socket没有任何影响
        
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
