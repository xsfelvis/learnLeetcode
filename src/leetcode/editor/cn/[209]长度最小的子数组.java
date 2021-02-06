package leetcode.editor.cn;
//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回
// 0。 
//
// 
//
// 示例： 
//
// 输入：s = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
// 
//
// 
//
// 进阶： 
//
// 
// 如果你已经完成了 O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 541 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // window [start...end]
        int start = 0;
        int end = -1;
        int sum = 0;
        int result = nums.length + 1;
        while (start < nums.length) {
            // 还有剩余元素未考察并且窗口内元素总和小于目标值s
            if (end + 1 < nums.length && sum < s) {
                end++;
                sum += nums[end];
            } else { // 尝试缩小窗口
                sum -= nums[start];
                start++;
            }

            // 窗口内元素总和大于等于目标值s则更新结果值
            if (sum >= s) {
                result = Math.min(result, end - start + 1);
            }
        }

        return result == nums.length + 1 ? 0 : result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
