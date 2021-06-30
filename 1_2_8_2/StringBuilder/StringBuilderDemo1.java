package StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] agrs){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("Hello");
        System.out.println(sb2);

        //链式编程
        sb2.append("World").append("Java").append(100);
        System.out.println(sb2);
        //反转
        sb2.reverse();
        System.out.println(sb2);
    }
}
