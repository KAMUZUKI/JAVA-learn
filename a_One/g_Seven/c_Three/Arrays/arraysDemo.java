package a_One.g_Seven.c_Three.Arrays;
import java.util.Arrays;

public class arraysDemo {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println( Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：>");
        System.out.println( Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 10);
        System.out.println("10的索引值为：" + index);

        //1,数组必须有序
        //2.如果要查找的元素存在,那么返回的是这个元素实际的索引
        //3.如果要查找的元素不存在,那么返回的是 (-插入点-1)
            //插入点:如果这个元素在数组中,他应该在哪个索引上.
    }
}

// 工具类设计思想

// 1. 构造方法用 private 修饰
// 2. 成员用 public static 修饰