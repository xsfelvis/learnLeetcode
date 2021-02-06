package leetcode.editor.cn;
//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。 
//
// 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。 
//
// 说明: 
//
// 
// 返回的下标值（index1 和 index2）不是从零开始的。 
// 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。 
// 
//
// 示例: 
//
// 输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。 
// Related Topics 数组 双指针 二分查找 
// 👍 466 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];

        // 定义左侧指针left，指向数组中第一个元素
        int left = 0;

        // 定义右侧指针right，指向数组中最后一个元素
        int right = numbers.length - 1;

        while (left < right) {
            // 如果左侧指针与右侧指针所指向的元素和等于目标值，则返回结果
            if (numbers[left] + numbers[right] == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }else if (numbers[left] + numbers[right] < target) {
                // 如果左侧指针与右侧指针所指向的元素和小于目标值
                // 因为数组是升序排列的，为了让两数之和变大一些
                // 因此应将左侧指针向右移动一位
                left++;
            }else if (numbers[left] + numbers[right] > target) {
                // 如果左侧指针与右侧指针所指向的元素和大于目标值
                // 因为数组是升序排列的，为了让两数之和变小一些
                // 因此应将右侧指针向左移动一位
                right--;
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
