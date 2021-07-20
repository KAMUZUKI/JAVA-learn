package a_One.i_Nine.d_Four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class charStreamDemo6 {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\testSort.txt"));
        String str = "3 4 6 8 5 1 9 2 7 0";
        bw.write(str);
        bw.close();

        //���󣺶�ȡ�ļ��е����ݣ�������ٴ�д�������ļ�
        //������
        //1.Ҫ���ļ��е����ݶ�ȡ������
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\testSort.txt"));
        
        //�����һ������д�������Ϊ������ļ��е�����
        //BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        String line;
        line = br.readLine();
        System.out.println("��ȡ��������Ϊ:\n" + line);
        br.close();

        //2.���տո�����и�
        String[] split = line.split(" ");

        //3.���ַ������͵�������int����
        int[] arr = new int[split.length];

        //����split���飬���Խ�������ת����
        for (int i = 0; i < split.length; i++) {
            String smallStr = split[i];
            //����ת��
            int number = Integer.parseInt(smallStr);
            //��ת����Ľ�����뵽arr��
            arr[i] = number;
        }

        //4.����
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //5.������֮����д�ص����� 1 2 3 4...
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\testSort.txt"));
        //д��
        for (int i = 0; i < arr.length; i++) {
            bw2.write(arr[i] + " ");
            bw2.flush();
        }

        //�ͷ���Դ
        bw2.close();
    }
}
