package _1_easy._22_05;

/*

给你两个二进制字符串，返回它们的和（用二进制表示）。
输入为 非空 字符串且只包含数字1和0。

示例1:
输入: a = "11", b = "1"
输出: "100"

 */

public class _67_二进制求和 {
    public static void main(String[] args) {
        String ret = new Solution().addBinary("11","11");
        System.out.println("ret = " + ret);
    }

    static class Solution {
        public String addBinary(String a, String b) {
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            StringBuilder builder = new StringBuilder();
            while(i >= 0 || j >= 0){
                if (i >= 0) carry += a.charAt(i--) - '0';
                if (j >= 0) carry += b.charAt(j--) - '0';
                builder.append(carry % 2);
                carry /= 2;
            }
            if (carry == 1){
                builder.append(carry);
            }
            return builder.reverse().toString();
        }
    }
}
