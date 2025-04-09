package wachi.leetcode.editor.en

//Given two binary strings a and b, return their sum as a binary string. 
//
// 
// Example 1: 
// Input: a = "11", b = "1"
//Output: "100"
// 
// Example 2: 
// Input: a = "1010", b = "1011"
//Output: "10101"
// 
// 
// Constraints: 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a and b consist only of '0' or '1' characters. 
// Each string does not contain leading zeros except for the zero itself. 
// 
//
// Related Topics Math String Bit Manipulation Simulation 👍 9844 👎 1036


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun addBinary(a: String, b: String): String {
        var currentAIndex = a.length - 1
        var currentBIndex = b.length - 1
        var isCarry = false
        var result = ""
        while (currentAIndex >= 0 || currentBIndex >= 0) {
            val aValue = if (currentAIndex < 0) 0 else a[currentAIndex].digitToInt()
            val bValue = if (currentBIndex < 0) 0 else b[currentBIndex].digitToInt()
            val cValue = if (isCarry) 1 else 0
            val sum = aValue + bValue + cValue
            isCarry = false
            when (sum) {
                0 -> {
                    result = "0$result"
                }
                1 -> {
                    result = "1$result"
                }
                2 -> {
                    result = "0$result"
                    isCarry = true
                }
                3 -> {
                    result = "1$result"
                    isCarry = true
                }
            }
            currentAIndex--
            currentBIndex--
        }
        return if (isCarry) "1$result" else result
    }
}
//leetcode submit region end(Prohibit modification and deletion)
