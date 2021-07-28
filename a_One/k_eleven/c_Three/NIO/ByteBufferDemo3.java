package a_One.k_eleven.c_Three.NIO;

import java.nio.ByteBuffer;

public class ByteBufferDemo3 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put("abc".getBytes());

//        flip()  �л���дģʽ��д?����
        byteBuffer.flip();
//        get()   ��һ���ֽ�
//        while(byteBuffer.limit() != byteBuffer.position()){
//            System.out.println((char) byteBuffer.get());
//        }

        for (int i = 0; i < byteBuffer.limit(); i++) {
            System.out.println((char) byteBuffer.get());
        }

//        get(byte[] dst) ������ֽ�
//        byte [] bytes = new byte[byteBuffer.limit()];
//        byteBuffer.get(bytes);
//        System.out.println(new String(bytes));

//        get(int index)  ��ָ���������ֽ�
//        System.out.println((char) byteBuffer.get(0));

//        rewind()    ��position����Ϊ0�������ظ���
//        byteBuffer.rewind();
//        for (int i = 0; i < byteBuffer.limit(); i++) {
//            System.out.println((char) byteBuffer.get());
//        }

//        clear()     ���ݶ�д��ϣ���->д��
        byteBuffer.clear();
        byteBuffer.put("qqq".getBytes());
//        array()     ��������ת�����ֽ����鷵��

        byte[] bytes = byteBuffer.array();
        System.out.println(new String(bytes));
    }
}
