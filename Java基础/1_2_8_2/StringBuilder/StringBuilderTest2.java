package StringBuilder;

import java.util.Scanner;

public class StringBuilderTest2 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
        String line  = sc.nextLine();
        String s = myReverse(line);
        System.out.println("s:" + s);
        sc.close();
    }

    public static String myReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
