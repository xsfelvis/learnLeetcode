package testjava;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {

        List<String> a = new ArrayList();
        List<Integer> b = new ArrayList();
        System.out.println(a.getClass() == b.getClass());
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
