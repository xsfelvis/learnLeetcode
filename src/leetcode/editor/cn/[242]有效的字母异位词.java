package leetcode.editor.cn;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 337 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution242 {
    //https://leetcode-cn.com/problems/valid-anagram/solution/you-xiao-de-zi-mu-yi-wei-ci-by-leetcode-solution/
    //方法一: 排序 对比
    //方法二: 哈希表
    //构建字母表

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //26字母处理
        int[] table = new int[26];
        for (int index = 0; index < s.length(); index++) {
            table[s.charAt(index) - 'a']++;
        }
        for (int index = 0; index < t.length(); index++) {
            table[t.charAt(index) - 'a']--;
            if (table[t.charAt(index) - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
