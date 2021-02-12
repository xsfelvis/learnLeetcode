package leetcode.editor.cn;
//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。 
//
// 说明: 
//1 ≤ m ≤ n ≤ 链表长度。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL 
// Related Topics 链表 
// 👍 669 👎 0


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
// 题解 https://leetcode-cn.com/problems/reverse-linked-list-ii/solution/yi-bu-yi-bu-jiao-ni-ru-he-yong-di-gui-si-lowt/
class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseTopN(head, n);
        }

        ListNode between = reverseBetween(head.next, m-1,n-1);
        head.next = between;
        return head;
    }

    ListNode topNSuccessor = null;

    private ListNode reverseTopN(ListNode head, int n) {
        if (n == 1) {
            topNSuccessor = head.next;
            return head;
        }

        ListNode newHead = reverseTopN(head.next, n-1);
        head.next.next = head;
        head.next = topNSuccessor;
        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
