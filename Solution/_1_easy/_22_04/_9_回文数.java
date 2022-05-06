package _1_easy._22_04;

/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。

示例 1：
输入：x = 121
输出：true
 */

public class _9_回文数 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(12321));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x == 0) return true;
            if (x < 0 || x % 10 == 0) return false;
            int reversed = 0;
            while (x > reversed) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }
            return x == reversed || x == reversed / 10;
        }
    }
}
