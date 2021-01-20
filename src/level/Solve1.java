package level;

public class Solve1 {
    //o(1) 移除多余数据
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //快慢指针
        int slow = 0;
        int quick = 1;
        while(quick< nums.length){
            if(nums[slow] == nums[quick]){
               quick++;
            } else {
                nums[slow+1] = nums[quick];
                slow++;
                quick++;
            }
        }
        return slow+1;

    }
}
