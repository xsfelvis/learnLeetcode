package leetcode.editor.cn;
//给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。 
//
// 示例 1: 
//
// 输入: 1->2->3->3->4->4->5
//输出: 1->2->5
// 
//
// 示例 2: 
//
// 输入: 1->1->1->2->3
//输出: 2->3 
// Related Topics 链表 
// 👍 448 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        //哑节点
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        //2个节点
        ListNode nodeA = dummyNode;
        ListNode nodeB = head;
        while (nodeB != null && nodeB.next != null) {
            if (nodeA.next.val != nodeB.next.val) {
                nodeA = nodeA.next;
                nodeB = nodeB.next;
            } else {
                //如果 ab 节点值相等,就不断移动b 直到 a b指向的值不相等
                while (nodeB != null && nodeB.next != null
                        && nodeA.next.val == nodeB.next.val) {
                    nodeB = nodeB.next;
                }
                //删除b节点
                nodeA.next = nodeB.next;
                //b继续移动
                nodeB = nodeB.next;
            }


        }
        return dummyNode.next;

        //


    }
}
//leetcode submit region end(Prohibit modification and deletion)
