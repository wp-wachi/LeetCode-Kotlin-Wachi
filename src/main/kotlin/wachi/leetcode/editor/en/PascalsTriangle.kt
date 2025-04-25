package wachi.leetcode.editor.en

//Given an integer numRows, return the first numRows of Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
// 
// 
// Example 1: 
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
// Example 2: 
// Input: numRows = 1
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= numRows <= 30 
// 
//
// Related Topics Array Dynamic Programming 👍 13668 👎 504


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = MutableList(numRows) { index ->
            MutableList(index + 1) {
                1
            }
        }
        var row = 1
        var col = 1
        while (row < numRows) {
            if (col < row) {
                result[row][col] = result[row - 1][col - 1] + result[row - 1][col]
                col++
            } else {
                row++
                col = 1
            }
        }
        return result
    }
}
//leetcode submit region end(Prohibit modification and deletion)
