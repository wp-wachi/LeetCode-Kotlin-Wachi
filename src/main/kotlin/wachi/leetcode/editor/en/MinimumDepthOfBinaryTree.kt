package wachi.leetcode.editor.en

//Given a binary tree, find its minimum depth. 
//
// The minimum depth is the number of nodes along the shortest path from the 
//root node down to the nearest leaf node. 
//
// Note: A leaf is a node with no children. 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: root = [2,null,3,null,4,null,5,null,6]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁵]. 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 75
//28 👎 1334


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

    fun minDepth(root: TreeNode?): Int {
        return minDepth(root, 1)
    }

    fun minDepth(node: TreeNode?, depth: Int): Int {
        if (node == null) {
            return depth - 1
        }
        if (node.left == null && node.right == null) return depth
        val depthLeft = minDepth(node.left, depth + 1)
        val depthRight = minDepth(node.right, depth + 1)
        return when {
            depthLeft == depth -> depthRight
            depthRight == depth -> depthLeft
            depthLeft < depthRight -> depthLeft
            else -> depthRight
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
