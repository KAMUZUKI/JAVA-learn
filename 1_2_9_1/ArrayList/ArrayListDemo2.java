import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] agrs){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        boolean b1 = list.remove("abc");
        boolean b2 = list.remove("zzz");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);

        list.set(2, "ddd");
        System.out.println(list);

        String s = list.get(4);
        System.out.println(s);
        
        int size = list.size();
        System.out.println(size);
    }

}
