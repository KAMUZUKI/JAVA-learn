package a_One.g_Seven.c_Three.Arrays;
import java.util.Arrays;

public class arraysDemo {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println( Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("�����>");
        System.out.println( Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 10);
        System.out.println("10������ֵΪ��" + index);

        //1,�����������
        //2.���Ҫ���ҵ�Ԫ�ش���,��ô���ص������Ԫ��ʵ�ʵ�����
        //3.���Ҫ���ҵ�Ԫ�ز�����,��ô���ص��� (-�����-1)
            //�����:������Ԫ����������,��Ӧ�����ĸ�������.
    }
}

// ���������˼��

// 1. ���췽���� private ����
// 2. ��Ա�� public static ����