package _1_easy._22_05;

/*

给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组 是数组中的一个连续部分。

示例 1：
输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组[4,-1,2,1] 的和最大，为6 。

 */

public class _53_最大子数组和 {
    public static void main(String[] args) {
        int result = new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
                                                        //-2,1,-2,4, 3,5,6, 1,5
        System.out.println("result = " + result);
    }
    static class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0,maxAns = nums[0];
            for(int x:nums){
                pre = Math.max(pre + x,x);
                maxAns = Math.max(maxAns,pre);
            }
            return maxAns;
        }
    }
}
