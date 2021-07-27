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
            //�����е���,�ӿͻ��˶�ȡ���ݵ�
            BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
            //���ص�IO��,������д��������,ʵ�����û��洢
            bos = new BufferedOutputStream(new FileOutputStream
            ("a_One\\k_eleven\\b_Two\\TcpCommunication\\TcpDemo5\\test" + UUID.randomUUID().toString() + ".txt"));

            int b;
            while((b = bis.read()) !=-1){
                bos.write(b);
            }
          
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("�ϴ��ɹ�");
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
