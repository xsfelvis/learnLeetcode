//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    @Throws(IllegalArgumentException::class)
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int, Int>()

        //第一遍hash
        for (i: Int in nums.indices) {
            map.put(nums[i], i)
        }

        //第二遍hash查找符合要求的数
        for (i: Int in nums.indices) {
            var findNum: Int = target - nums[i]
            if (map.containsKey(findNum) && map.getValue(findNum) != i) {
                return intArrayOf(i, map.getValue(findNum))
            }
        }

        throw  IllegalArgumentException("No two sum solution");

    }
}
//leetcode submit region end(Prohibit modification and deletion)
