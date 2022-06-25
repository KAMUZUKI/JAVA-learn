import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("zhangsan");
        list.add("lisi");
        list.add("test");
        list.add("test");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == "test")
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
