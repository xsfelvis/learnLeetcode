package leetcode.editor.cn;
//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 693 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution28 {
    public int strStr(String haystack, String needle) {
        // 安全性检查
        if (haystack == null || needle == null)
            return 0;
        if (needle.length() == 0)
            return 0;
        if (!haystack.contains(needle)) {
            return -1;
        }
        //固定窗口法
        int windowsSize = needle.length();
        int haystackLength = haystack.length();
        for (int index = 0; index <= haystackLength - 1; index++) {
            String windowStr = haystack.substring(index, index + windowsSize);
            if (index + windowsSize <= haystackLength
                    && windowStr.equals(needle)) {
                return index;
            }
        }
        return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
