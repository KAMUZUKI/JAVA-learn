package src.com.mu;

/*

给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。

示例 1:
输入: nums = [1,3,5,6], target = 5
输出: 2

 */

public class _35_搜索插入位置 {
    public static void main(String[] args) {
        int result = new Solution().searchInsert(new int[]{1,3,5,6},5);
        System.out.println("result = " + result);
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int l=0,r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]<target)
                    l=mid+1;
                else r=mid-1;
            }
            return l;
        }
    }
}
