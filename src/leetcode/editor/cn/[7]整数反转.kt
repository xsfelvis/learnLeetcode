//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学

package leetcode.editor.cn

object ReverseInteger {
    @JvmStatic
    fun main(args: Array<String>) {
        var solution: Solution = Solution()
        print(solution.reverse(123))
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverse(x: Int): Int {
            var xin = x
            var reverseReslut: Long = 0
            while (xin != 0) {
                reverseReslut = reverseReslut * 10 + xin % 10
                if (reverseReslut > Int.MAX_VALUE || reverseReslut < Int.MIN_VALUE) {
                    return 0
                }
                xin /= 10
            }

            return reverseReslut.toInt()

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}