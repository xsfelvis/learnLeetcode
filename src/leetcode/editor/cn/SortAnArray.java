//给定一个整数数组 nums，将该数组升序排列。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：[5,2,3,1]
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：[5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// -50000 <= A[i] <= 50000 
// 
//

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class SortAnArray {
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();

        int[] testNum = new int[]{5, 2, 3, 1};
        solution.sortArray(testNum);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> sortArry = new ArrayList<>();
            quickSort(nums, 0, nums.length - 1);
            for (int i = 0; i < nums.length; i++) {
                sortArry.add(nums[i]);
            }
            return sortArry;
        }
        //整体要符合交换才能work
        private int divide(int[] nums, int start, int end) {
            //锚点定在左边
            int base = nums[start];
            //多遍寻找
            while (start < end) {
                //右边寻找
                while (start < end && nums[end] >= base) end--;
                //右边找到不符合的数，扔到左边来
                nums[start] = nums[end];

                //左边寻找
                while (start < end && nums[start] <= base) start++;
                //左边找到需要不符合的树，扔到右边
                nums[end] = nums[start];
            }
            //完成交换
            nums[start] = base;

            //交替完返回下标
            return start;
        }


        public void quickSort(int[] nums, int start, int end) {
            if (start >= end) return;
            int divide = divide(nums, start, nums.length - 1);
            quickSort(nums, start, divide - 1);
            quickSort(nums, divide + 1, end);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}