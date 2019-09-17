//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

package leetcode.editor.cn


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    var sumNodeHead: ListNode? = ListNode(-1)
    var sumNodeTemp: ListNode? = sumNodeHead
    var carray: Int = 0

    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode? {
        var actOne: ListNode? = l1
        var actTwo: ListNode? = l2
        while (actOne != null && actTwo != null) {
            val sum: Int = (actOne!!.`val` + actTwo!!.`val`) + carray
            carray = sum / 10
            sumNodeTemp?.next = ListNode(sum % 10)
            actOne = actOne.next
            actTwo = actTwo.next
            sumNodeTemp = sumNodeTemp?.next
            sumNodeTemp
        }

        while (actOne != null) {
            val sum: Int = (actOne.`val`) + carray
            carray = sum / 10
            sumNodeTemp?.next = ListNode(sum % 10)
            actOne = actOne.next
            sumNodeTemp = sumNodeTemp?.next
        }

        while (actTwo != null) {
            val sum: Int = (actTwo.`val`) + carray
            carray = sum / 10
            sumNodeTemp?.next = ListNode(sum % 10)
            actTwo = actTwo.next
            sumNodeTemp = sumNodeTemp?.next
        }

        if(carray >0){
            sumNodeTemp?.next = ListNode(carray)
        }

        return sumNodeHead?.next
    }
}
//leetcode submit region end(Prohibit modification and deletion)
