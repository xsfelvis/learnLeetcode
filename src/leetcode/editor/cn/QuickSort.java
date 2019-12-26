package leetcode.editor.cn;

public class QuickSort {
    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
//        int[] test = new int[]{3,2,1,5,6,4};
        Solution solution = new QuickSort().new Solution();
        solution.findKthLargest(test, 4);
//        solution.findKthLargest(test,2);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0) return -1;
            quickSort(nums, 0, nums.length - 1);
            int reslult = nums[nums.length - k];
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
            int base = nums[start];
            while (start < end) {

                while(start < end && nums[end] > base) end--;
                nums[start] = nums[end];

                while (start < end && nums[start] <= base) start++;
                nums[end] = nums[start];

            }

            nums[start] = base;
            //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
            return start;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
