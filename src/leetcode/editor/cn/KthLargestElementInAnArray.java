//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 示例 1: 
//
// 输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 说明: 
//
// 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。 
// Related Topics 堆 分治算法

package leetcode.editor.cn;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] test = new int[]{3,2,3,1,2,4,5,5,6};
//        int[] test = new int[]{3,2,1,5,6,4};
        Solution solution = new KthLargestElementInAnArray().new Solution();
        solution.findKthLargest(test,4);
//        solution.findKthLargest(test,2);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0) return -1;
            quickSort(nums, 0, nums.length-1);
            int reslult = nums[nums.length-k];
            System.out.println(reslult);
            return reslult;

        }

        public void quickSort(int[] nums, int start, int end) {
            if (start > end) return;
            int divide = divide(nums, start, end);
            quickSort(nums, start, divide - 1);//左边
            quickSort(nums, divide + 1, end);//左边
        }

        //快速排序
        public int divide(int[] nums, int start, int end) {
            if (nums == null || nums.length == 0) return -1;
            int base = nums[end];
            while (start < end) {
                //右边,小于基准值 下标继续往右
                while (start < end && nums[start] <= base) start++;
                //此时出现大于基准的准备交换start、end位置
                if (start < end) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    //交换完之后 右边左移一位
                    end--;
                }

                while (start < end && nums[end] >= base) end--;
                //此时出现需要调换的数
                if (start < end) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    //交换完之后 左边边右移一位
                    start++;
                }

            }
            //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
            return end;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}