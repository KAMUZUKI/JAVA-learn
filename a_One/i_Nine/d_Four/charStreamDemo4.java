package a_One.i_Nine.d_Four;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class charStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //����: ������¼����û��������뱣�浽����ʵ�����û��洢
        //Ҫ���û�����ռһ�У������ռһ��

        //������
        //1��ʵ�ּ���¼�룬���û���������¼�����
        Scanner sc = new Scanner(System.in);
        System.out.println("��¼���û���");
        String username = sc.next();
        System.out.println("��¼������");
        String password = sc.next();

        //2.�ֱ���û���������д�������ļ���
        FileWriter fw = new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\admin.txt");
        //���û���������д���ļ���
        fw.write(username);
        //��ʾд��һ���س����з� windows \r\n  MacOS \r  Linux \n
        fw.write("\r\n");
        fw.write(password);
        //ˢ����
        fw.flush();
        //3.����,�ͷ���Դ
        fw.close();
        sc.close();
    }
    
}
