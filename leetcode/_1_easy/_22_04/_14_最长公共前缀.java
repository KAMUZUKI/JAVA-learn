package _1_easy._22_04;

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串""。

示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"
*/

public class _14_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "a"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String ans = strs[0];
            for(int i =1;i<strs.length;i++) {
                int j=0;
                for(;j<ans.length() && j < strs[i].length();j++) {
                    if(ans.charAt(j) != strs[i].charAt(j))
                        break;
                }
                ans = ans.substring(0, j);
                if(ans.equals(""))
                    return ans;
            }
            return ans;

            /*
            String result = "";
            if (strs.length <= 1){
                return strs[0];
            }
            for (int i = 1; i < strs[0].length(); i++){
                String ret = strs[0].substring(0,i);
                for (int j = 1; j < strs.length; j++) {
                    String tmpCompare = strs[j].substring(0,i);
                    boolean tmpResult = ret.equals(tmpCompare);
                    if (tmpResult){
                        if (j == strs.length - 1){
                            result = ret;
                        }
                    }else{
                        return result;
                    }
                }
            }
            return "";
            */
        }
    }
}
