package leetcode.editor.cn;
//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。 
//
// 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。 
//
// 示例: 
//
// 给定有序数组: [-10,-3,0,5,9],
//
//一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics 树 深度优先搜索 
// 👍 696 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution108 {
    //题解
    // https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/solution/jian-dan-di-gui-bi-xu-miao-dong-by-sweetiee/
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        //先取中间节点
        int mid = lo + (hi - lo) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
