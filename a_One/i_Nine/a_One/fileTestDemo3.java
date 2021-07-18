package a_One.i_Nine.a_One;

import java.io.File;
import java.util.HashMap;

// ### 1.8File����ϰ����Ӧ�á�

// + ��������

//   ͳ��һ���ļ�����ÿ���ļ��ĸ�������ӡ

//   ��ӡ��ʽ���£�

//     			txt:3��
//     			doc:4��
//     			jpg:6��
    	
//     			 ��

// + ʵ�ֲ���
//   + ����һ������,������HashMap��������ͳ�ƴ�����File����Ҫͳ�Ƶ��ļ���
//   + ����File����,��ȡ���±ߵ�ÿһ���ļ����ļ��ж���
//   + �жϵ�ǰFile�������ļ������ļ���
//   + ������ļ�,�ж����������ļ���׺����HashMap�������Ƿ���ֹ�
//   + û���ֹ�,�����������ļ��ĺ�׺�����뼯����,������1
//   + ���ֹ�,��ȡ���������ļ��ĺ�׺�����ֵĴ���,����+1,�ڴ�ؼ�����
//   + ������ļ���,�ݹ�����Լ�,HashMap���Ͼ��ǲ�������,File�����ǵ�ǰ�ļ��ж���
public class fileTestDemo3 {
    public static void main(String[] args) {
        //ͳ��һ���ļ�����,ÿ���ļ����ֵĴ���.
        //ͳ�� --- ����һ����������ͳ��. ---- �׶�:ͬʱֻ��ͳ��һ���ļ�
        //����map���Ͻ�������ͳ��,�� --- �ļ���׺��  ֵ ----  ����

        File file = new File("D:\\JAVA_PROGRAM");
        HashMap<String,Integer> hm = new HashMap<>();
        getCount(hm,file);
        System.out.println(hm); 
    }

    //1.����һ������,������HashMap��������ͳ�ƴ�����File����Ҫͳ�Ƶ��ļ���
    public static void getCount(HashMap<String, Integer> hm, File file){
        //2.����File����,��ȡ���±ߵ�ÿһ���ļ����ļ��ж���
        File[] files = file.listFiles();
        for(File f : files){
            //3.�жϵ�ǰFile�������ļ������ļ���
            if (f.isFile()) {
                //������ļ�,�ж����������ļ���׺����HashMap�������Ƿ���ֹ�
                String fileName = f.getName();
                String[] fileNameArr = fileName.split("\\.");
                if (fileNameArr.length == 2) {
                    String fileEndName = fileNameArr[1];
                    if (hm.containsKey(fileEndName)) {
                        //���ֹ�,��ȡ���������ļ��ĺ�׺�����ֵĴ���,����+1,�ڴ�ؼ�����
                        Integer count = hm.get(fileEndName);
                        //�����ļ��ֳ�����һ��.
                        count++;
                        //���Ѿ����ֵĴ��������ǵ�.
                        hm.put(fileEndName, count);
                    } else {
                        // û���ֹ�,�����������ļ��ĺ�׺�����뼯����,������1
                        hm.put(fileEndName, 1);
                    }
                }
            } else {
                //������ļ���,�ݹ�����Լ�,HashMap���Ͼ��ǲ�������,File�����ǵ�ǰ�ļ��ж������ʵ��
                getCount(hm, f);
            }
        } 
    }
}
