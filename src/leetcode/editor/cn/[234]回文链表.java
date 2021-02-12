package leetcode.editor.cn;
//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 850 👎 0


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
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        //解法 https://leetcode-cn.com/problems/palindrome-linked-list/solution/hui-wen-lian-biao-by-leetcode-solution/
        //转到数组 然后通过数字判断回文
        //双指针
        if (head == null) {
            return true;
        }
        //找到中间
        ListNode firstHalfEnd = endofFirstHalf(head);
        //反转后半段
        ListNode sendHalfStart = reversList(firstHalfEnd.next);

        ListNode p1 = head;
        ListNode p2 = sendHalfStart;

        //回文判断
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;


    }


    private ListNode endofFirstHalf(ListNode head) {

        //快慢指针找到中间
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reversList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //保存节点
            ListNode next = cur.next;
            //反转节点
            cur.next = pre;
            //移动节点
            pre = cur;
            cur = next;
        }


        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
