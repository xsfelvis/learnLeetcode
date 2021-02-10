package leetcode.editor.cn;
//给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2523 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution7 {
    //题解 https://leetcode-cn.com/problems/reverse-integer/solution/tu-jie-7-zheng-shu-fan-zhuan-by-wang_ni_ma/
    //栈、取模取余 或者 变成字符串反转但是要注意符号
    //这里使用取模解法
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //取尾巴
            int temp = x % 10;
            //判断最后一位是否溢出
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && temp < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            res = res * 10 + temp;
            x /= 10;

        }
        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
