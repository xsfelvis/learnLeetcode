package testjava;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 2, 3};
        int index = new Solution().removeElement(test, 3);
        System.out.println(index);


    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            if (nums == null) {
                return -1;
            }
            int left = 0;
            int right = 0;
            while (left <= right && right < nums.length && left < nums.length) {
                if (nums[right] == val) {
                    left++;
                    if(left>=nums.length){
                        break;
                    }
                    //交换
                    int temp;
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                right++;
            }

            return left + 1;

        }
    }

}
