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
// 👍 322 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution125 {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();

        int left = 0;
        int right = lowerCase.length() - 1;
        while (left < right) {
            // 指针left小于指针right且当前考察的字符不是字母或数字，指针left向左移动
            while (left < right && !Character.isLetterOrDigit(lowerCase.charAt(left))) {
                left++;
            }

            // 指针left小于指针right且当前考察的字符不是字母或数字，指针right向右移动
            while (left < right && !Character.isLetterOrDigit(lowerCase.charAt(right))) {
                right--;
            }

            // 如果指针left指向的字符与指针right指向的字符不同，则不是回文串
            if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
                return false;
            }

            // 指针left左移，指针right右移，继续考察下一对字符
            left++;
            right--;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
