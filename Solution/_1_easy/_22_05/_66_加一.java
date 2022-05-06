package _1_easy._22_05;

/*

给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例1：
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。

 */

public class _66_加一 {
    public static void main(String[] args) {
        int[] ret = new Solution().plusOne(new int[] {9});
        for(int i:ret){
            System.out.print(i + ", ");
        }
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for (int i = len - 1; i >= 0 ; i--) {
                digits[i] = (digits[i] + 1)%10;
                if (digits[i] != 0){
                    return digits;
                }
            }
            digits = new int[len+1];
            digits[0] = 1;
            return digits;
        }
    }
}
