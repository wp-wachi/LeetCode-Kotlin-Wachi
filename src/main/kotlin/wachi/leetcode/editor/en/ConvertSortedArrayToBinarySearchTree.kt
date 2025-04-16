package wachi.leetcode.editor.en

//Given an integer array nums where the elements are sorted in ascending order, 
//convert it to a height-balanced binary search tree. 
//
// 
// Example 1: 
// 
// 
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
// 
//
// Example 2: 
// 
// 
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in a strictly increasing order. 
// 
//
// Related Topics Array Divide and Conquer Tree Binary Search Tree Binary Tree ?
//? 11395 👎 599


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return toBST(nums, 0, nums.size - 1)
    }

    fun toBST(nums: IntArray, startIndex: Int, endIndex: Int): TreeNode? {
        if (startIndex > endIndex) {
            return null
        }
        val midIndex = (startIndex + endIndex + 1) / 2
        val treeNode = TreeNode(nums[midIndex])
        treeNode.left = toBST(nums, startIndex, midIndex - 1)
        treeNode.right = toBST(nums, midIndex + 1, endIndex)
        return treeNode
    }
}
//leetcode submit region end(Prohibit modification and deletion)
