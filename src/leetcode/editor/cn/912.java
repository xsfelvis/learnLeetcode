package leetcode.editor.cn;
//给你一个整数数组 nums，请你将该数组升序排列。
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：nums = [5,2,3,1]
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 输入：nums = [5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// -50000 <= nums[i] <= 50000 
// 
// 👍 206 👎 0


import java.util.Arrays;


//leetcode submit region begin(Prohibit modification and deletion)
class Solution912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    //快速排序
    public void quickSort(int[] nums, int begin, int end) {
        if(nums == null || nums.length == 0){
            return;
        }
        int mid = patition(nums, begin, end);
        quickSort(nums, begin, mid - 1);
        quickSort(nums, mid + 1, end);
    }

    private int patition(int[] nums, int left, int right) {
        //双指针
        int begin = left;
        int end = right;
        int key = right;
        while(begin < end){
            //左边寻找大于keyPoint
            while(begin < end && nums[begin]<=nums[key]){
                begin++;
            }

            //右边寻找小于keyPoint
            while(begin < end && nums[end]>=nums[key]){
                end--;
            }
            //找到交换
            swapNum(nums,begin,end);
        }
        //交换最后一个元素,此时begin已经在中间
        swapNum(nums,begin,right);
        return begin;
    }

    private void swapNum(int[] nums, int begin, int right) {
        int temp = nums[begin];
        nums[begin] = nums[right];
        nums[right] = temp;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
