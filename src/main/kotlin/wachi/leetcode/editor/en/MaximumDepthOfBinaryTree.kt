package wachi.leetcode.editor.en

//Given the root of a binary tree, return its maximum depth. 
//
// A binary tree's maximum depth is the number of nodes along the longest path 
//from the root node down to the farthest leaf node. 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,2]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// -100 <= Node.val <= 100 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 13
//460 👎 259


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

    fun maxDepth(root: TreeNode?): Int {
        return maxDepth(root, 0)
    }

    fun maxDepth(node: TreeNode?, depth: Int): Int {
        if (node == null) return depth
        val depthLeft = maxDepth(node.left, depth + 1)
        val depthRight = maxDepth(node.right, depth + 1)
        return if (depthLeft > depthRight)
            depthLeft else depthRight
    }
}
//leetcode submit region end(Prohibit modification and deletion)
