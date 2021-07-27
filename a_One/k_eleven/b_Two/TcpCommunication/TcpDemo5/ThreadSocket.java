package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable{
    private Socket acceptSocket;

    public ThreadSocket(Socket accept){
        this.acceptSocket = accept;
    }

    @Override
    public void run(){
        BufferedOutputStream bos = null;
        try {
            //网络中的流,从客户端读取数据的
            BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
            //本地的IO流,把数据写到本地中,实现永久化存储
            bos = new BufferedOutputStream(new FileOutputStream
            ("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo5\\test" + UUID.randomUUID().toString() + ".txt"));

            int b;
            while((b = bis.read()) !=-1){
                bos.write(b);
            }
          
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (acceptSocket != null){
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
