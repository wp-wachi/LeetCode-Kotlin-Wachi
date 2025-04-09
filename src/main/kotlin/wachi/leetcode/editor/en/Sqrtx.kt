package wachi.leetcode.editor.en

//Given a non-negative integer x, return the square root of x rounded down to 
//the nearest integer. The returned integer should be non-negative as well. 
//
// You must not use any built-in exponent function or operator. 
//
// 
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. 
// 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down 
//to the nearest integer, 2 is returned.
// 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
//
// Related Topics Math Binary Search 👍 8776 👎 4571

//9
//left = 1
//right = 9
//mid = 1 + (9 - 1) / 2 = 5
//midPow2 = 25
//
//left = 1
//right = 5
//mid = 1 + (5 - 1) / 2 = 3
//midPow2 = 9


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x

        if (x < 2) {
            return x
        }
        while (left + 1 != right) {
            val mid = left + (right - left) / 2
            val midPow2 = mid.toLong() * mid.toLong()
            when {
                midPow2 == x.toLong() -> return mid
                midPow2 > x -> right = mid
                else -> left = mid
            }
        }
        return left
    }
}
//leetcode submit region end(Prohibit modification and deletion)
