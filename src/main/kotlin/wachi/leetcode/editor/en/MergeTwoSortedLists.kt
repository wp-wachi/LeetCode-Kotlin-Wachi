package wachi.leetcode.editor.en

//You are given the heads of two sorted linked lists list1 and list2. 
//
// Merge the two lists into one sorted list. The list should be made by 
//splicing together the nodes of the first two lists. 
//
// Return the head of the merged linked list. 
//
// 
// Example 1: 
// 
// 
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
// 
//
// Example 2: 
//
// 
//Input: list1 = [], list2 = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: list1 = [], list2 = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both lists is in the range [0, 50]. 
// -100 <= Node.val <= 100 
// Both list1 and list2 are sorted in non-decreasing order. 
// 
//
// Related Topics Linked List Recursion 👍 23009 👎 2250


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

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return mergeTwoLists(null, list1, list2)
    }

    private fun mergeTwoLists(mergedList: ListNode?, list1: ListNode?, list2: ListNode?): ListNode? {
        return when {
            list1 == null -> mergedList.let {
                if (it == null) {
                    list2
                } else {
                    it.next = list2
                    mergedList
                }
            }

            list2 == null -> mergedList.let {
                if (it == null) {
                    list1
                } else {
                    it.next = list1
                    mergedList
                }
            }

            list1.`val` <= list2.`val` -> mergedList.let {
                if (it == null) {
                    ListNode(list1.`val`).apply {
                        mergeTwoLists(this, list1.next, list2)
                    }
                } else {
                    it.next = ListNode(list1.`val`)
                    mergeTwoLists(it.next, list1.next, list2)
                }
            }

            else -> mergedList.let {
                if (it == null) {
                    ListNode(list2.`val`).apply {
                        mergeTwoLists(this, list1, list2.next)
                    }
                } else {
                    it.next = ListNode(list2.`val`)
                    mergeTwoLists(it.next, list1, list2.next)
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
