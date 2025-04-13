package wachi.leetcode.editor.en

//Given the root of a binary tree, return the inorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
// Input: root = [1,null,2,3] 
// 
//
// Output: [1,3,2] 
//
// Explanation: 
//
// 
//
// Example 2: 
//
// 
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9] 
// 
//
// Output: [4,2,6,5,7,1,3,9,8] 
//
// Explanation: 
//
// 
//
// Example 3: 
//
// 
// Input: root = [] 
// 
//
// Output: [] 
//
// Example 4: 
//
// 
// Input: root = [1] 
// 
//
// Output: [1] 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
// Related Topics Stack Tree Depth-First Search Binary Tree 👍 14023 👎 835


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

    fun inorderTraversal(root: TreeNode?): List<Int> {
        val resultList = mutableListOf<Int>()
        traversal(root, resultList)
        return resultList
    }

    fun traversal(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return
        if (root.left != null) {
            traversal(root.left, list)
        }
        list.add(root.`val`)
        if (root.right != null) {
            traversal(root.right, list)
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
