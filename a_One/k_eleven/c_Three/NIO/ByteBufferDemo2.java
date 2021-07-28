package a_One.k_eleven.c_Three.NIO;

import java.nio.ByteBuffer;

public class ByteBufferDemo2 {
    public static void main(String[] args) {
        //        int position()		  ��ǰҪ����������
        //        int limit() 		  ����ܲ������ĸ�����
        //        int capacity()		  ���������ܳ���
                ByteBuffer byteBuffer = ByteBuffer.allocate(10);
                System.out.println(byteBuffer.position());//0
                System.out.println(byteBuffer.limit());//10
                System.out.println(byteBuffer.capacity());//10
        
        //        put(byte b)		  һ�����һ���ֽ�
        //        byteBuffer.put((byte) 97);
        //        System.out.println(byteBuffer.position());
        //        System.out.println(byteBuffer.limit());
        //        System.out.println(byteBuffer.capacity());
        
        //        put(byte[] src)		 һ�����һ���ֽ�����
        //        byteBuffer.put("aaa".getBytes());
        //        System.out.println(byteBuffer.position());//3
        //        System.out.println(byteBuffer.limit());//10
        //        System.out.println(byteBuffer.capacity());//10
        
        //        position(int newPosition) �޸�position
        //        byteBuffer.position(1);
        
        //        limit(int newLimit)	  �޸�limit
        //        byteBuffer.limit(5);
        //        System.out.println(byteBuffer.position());
        //        System.out.println(byteBuffer.limit());
        //        System.out.println(byteBuffer.capacity());
        
        //        int remaining()		  ���ж����ܲ���
        //        boolean hasRemaining()	  �Ƿ����ܲ�����
        
                byteBuffer.put("0123456789".getBytes());
                System.out.println(byteBuffer.remaining());
                System.out.println(byteBuffer.hasRemaining());
            }
}
