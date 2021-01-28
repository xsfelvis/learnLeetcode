package testjava;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 2, 4, 2, 3};
        int index = removeElement(test, 2);
        System.out.println(index);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return -1;
        }
        int slow = 0;
        int fast = 0;

        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == val) {
                continue;
            }
            nums[slow] = nums[fast];
            slow++;
        }
        return slow;
    }


}
