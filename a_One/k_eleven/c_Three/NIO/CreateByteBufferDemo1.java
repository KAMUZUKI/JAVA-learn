package a_One.k_eleven.c_Three.NIO;

import java.nio.ByteBuffer;

public class CreateByteBufferDemo1 {
    public static void main(String[] args){
        method1();

        method2();

        ByteBuffer wrap = ByteBuffer.wrap("aaa".getBytes());
        for (int i = 0; i < 3; i++) {
            System.out.println(wrap.get());
        }
        System.out.println("===================");
    }

    private static void method2() {
        byte [] bytes = {97,98,99,100,101,102};
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(bytes);
        //缓冲区的长度3
        //缓冲区里面的内容就是字节数组的内容.
        for (int i = 0; i < 3; i++) {
            System.out.println(byteBuffer2.get());
        }
        System.out.println("-------------------");
        System.out.println(byteBuffer2.get());
        System.out.println("===================");
    }

    private static void method1() {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(10);
        //get
        for (int i = 0; i < 5; i++) {
            System.out.println(byteBuffer1.get());
        }
        System.out.println("-------------------");
        System.out.println(byteBuffer1.get());
        System.out.println("===================");
    }
}
