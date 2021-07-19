package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopyJpgDemo{
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\壁纸\\pixies-b.png");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\wallpaper.jpg");

        //读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            fos.write(bys,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}