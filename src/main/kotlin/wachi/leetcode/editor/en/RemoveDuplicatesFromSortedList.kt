package wachi.leetcode.editor.en

//Given the head of a sorted linked list, delete all duplicates such that each 
//element appears only once. Return the linked list sorted as well. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,1,2]
//Output: [1,2]
// 
//
// Example 2: 
// 
// 
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 300]. 
// -100 <= Node.val <= 100 
// The list is guaranteed to be sorted in ascending order. 
// 
//
// Related Topics Linked List 👍 9178 👎 336


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

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null) {
            val nextVal = current.next?.`val`
            if (current.`val` == nextVal) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
        return head
    }
}
//leetcode submit region end(Prohibit modification and deletion)
