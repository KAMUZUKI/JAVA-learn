package a_One.g_Seven.c_Three.MyFactoriy;
import java.util.Scanner;

public class myFactoriyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ��Ľ׳ˣ�>");
        int number = sc.nextInt();
        int result = jc(number);
        System.out.println(number + "�Ľ׳�Ϊ��" + result);
        sc.close();
    }

    public static int jc(int num){
        if (num == 1) {
            return 1;
        } else {
            return num*jc(num-1);
        }
    }
}
