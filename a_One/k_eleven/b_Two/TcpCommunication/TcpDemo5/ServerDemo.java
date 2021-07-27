package a_One.k_eleven.b_Two.TcpCommunication.TcpDemo5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10004);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 10, 60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

            while (true) {
                Socket accept = ss.accept();
                ThreadSocket ts = new ThreadSocket(accept);
                pool.submit(ts);
            }

    }
}
