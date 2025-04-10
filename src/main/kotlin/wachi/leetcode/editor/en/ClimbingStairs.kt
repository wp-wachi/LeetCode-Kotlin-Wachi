package wachi.leetcode.editor.en

//You are climbing a staircase. It takes n steps to reach the top. 
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can 
//you climb to the top? 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 45 
// 
//
// Related Topics Math Dynamic Programming Memoization 👍 22989 👎 948


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun climbStairs(n: Int): Int {
        val memo: MutableMap<Int, Int> = mutableMapOf()
        return fib(n + 1, memo)
    }

    private fun fib(n: Int, memo: MutableMap<Int, Int>): Int {
        if (memo.containsKey(n)) return memo[n]!!
        if (n <= 1) return n

        val result = fib(n - 1, memo) + fib(n - 2, memo)
        memo[n] = result
        return result
    }
}
//leetcode submit region end(Prohibit modification and deletion)
