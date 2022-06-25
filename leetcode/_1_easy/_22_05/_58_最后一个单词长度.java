package _1_easy._22_05;

/*

给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。

示例 1：
输入：s = "Hello World"
输出：5
解释：最后一个单词是“World”，长度为5。

 */
public class _58_最后一个单词长度 {
    public static void main(String[] args) {
        int result = new Solution().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("result = " + result);
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            /*
            // 2ms
            int ret = 0;
            for (int i = 0,count = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    count++;
                    ret = count;
                }else{
                    count = 0;
                }
            }
            return ret;
            */

            // 0ms
            int res = 0;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i) == ' ' && res !=0 ){
                    break;
                }
                if(s.charAt(i)!=' '){
                    res ++;
                }
            }
            return res;
        }
    }
}
