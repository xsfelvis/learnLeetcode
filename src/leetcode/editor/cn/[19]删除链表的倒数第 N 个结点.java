package leetcode.editor.cn;
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 
// 👍 1204 👎 0


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
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        //快慢指针
//        ListNode slow = head;
//        ListNode fast = head;
//        //前进n步
//        while (n>0){
//            fast = fast.next;
//            n--;
//        }
//        while (fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        //此时slow就是 开始删除
//        slow.val = slow.next.val;
//        slow.next = slow.next.next;
//        return head;

        //思路：使用一个哑结点，找到n个节点
        //题解：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-b-61/
        ListNode dummy = new ListNode(0, head);
        int length = getNodeLength(head);
        ListNode cur = dummy;
        for (int index = 1; index < length - n + 1; index++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode res = dummy.next;
        return res;


    }

    private int getNodeLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
