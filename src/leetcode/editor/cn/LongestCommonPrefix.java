//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

package leetcode.editor.cn;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] inputStrs = new String[]{"flower","flow","flight"};
        Solution solution = new LongestCommonPrefix().new Solution();
        solution.longestCommonPrefix(inputStrs);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String longestCommonPrefix = strs[0];
            for (String str : strs) {
                //第一个返回 0,其余第一个为-1进入while循环
                while (str.indexOf(longestCommonPrefix) != 0) {
                    longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
                    if (longestCommonPrefix.isEmpty()) return "";
                }
            }
            return longestCommonPrefix;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}