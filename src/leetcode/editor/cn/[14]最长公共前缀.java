package leetcode.editor.cn;
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1452 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
    //https://leetcode-cn.com/problems/longest-common-prefix/solution/javazhong-liang-chong-bi-jiao-hao-li-jie-ezx5/
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int index = 1; index < strs.length; index++) {
            //由于是前缀
            while (!strs[index].startsWith(res)) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
