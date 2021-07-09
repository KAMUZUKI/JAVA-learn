package a_One.g_Seven.c_Three.MyBinarySearch;


public class myBinarySearch {
    public static void main(String[] args) {
        int number = 1;
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = binaryFind(arr,number);
        if(index == -1){
            System.out.print("ÊäÈë´íÎó£¡");
        }
        System.out.println(index);
    }
    
    public static int binaryFind(int[] arr,int number){
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) >> 1; 
            if (arr[mid] > number) {
                max = mid -1;
            } else if(arr[mid] < number){
                min = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
