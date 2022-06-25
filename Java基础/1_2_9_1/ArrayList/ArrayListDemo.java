import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] agrs){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2,50);
        System.out.println(list);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (i > 0) {
                System.out.print("," + n);
            } else {
                System.out.print(n);
            }
        }
        System.out.println("]");
    
    }
}
