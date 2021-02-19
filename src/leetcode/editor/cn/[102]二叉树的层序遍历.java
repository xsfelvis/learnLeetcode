package leetcode.editor.cn;
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层序遍历结果： 
//
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 768 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //题解 https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/die-dai-di-gui-duo-tu-yan-shi-102er-cha-shu-de-cen/
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        //广度优先遍历 队列
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        //加入根节点
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            //层次数组
            List<Integer> levelLsit = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                //将temp数组放置到
                levelLsit.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(levelLsit);


        }
        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
