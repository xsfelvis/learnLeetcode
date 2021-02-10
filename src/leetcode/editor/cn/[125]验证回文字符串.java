package leetcode.editor.cn;
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 325 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution125 {
    //碰撞指针
    //https://leetcode-cn.com/problems/valid-palindrome/solution/yan-zheng-hui-wen-chuan-by-leetcode-solution/
    public boolean isPalindrome(String s) {
        //过滤字符串
        StringBuffer sb = new StringBuffer();
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        //碰撞指针判断回文
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(sb.charAt(left)) != Character.toLowerCase(sb.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
