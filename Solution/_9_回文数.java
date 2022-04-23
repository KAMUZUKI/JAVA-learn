package _22_04;

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
