package wachi.leetcode.editor.en

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// Every close bracket has a corresponding open bracket of the same type. 
// 
//
// 
// Example 1: 
//
// 
// Input: s = "()" 
// 
//
// Output: true 
//
// Example 2: 
//
// 
// Input: s = "()[]{}" 
// 
//
// Output: true 
//
// Example 3: 
//
// 
// Input: s = "(]" 
// 
//
// Output: false 
//
// Example 4: 
//
// 
// Input: s = "([])" 
// 
//
// Output: true 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of parentheses only '()[]{}'. 
// 
//
// Related Topics String Stack 👍 25331 👎 1855


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<String>()
        val closeBracketMap = hashMapOf(")" to "(", "}" to "{", "]" to "[")

        for (char in s) {
            val charStr = char.toString()
            if (charStr in closeBracketMap.values) {
                stack.addLast(charStr)  // Push open brackets to the stack
            } else if (charStr in closeBracketMap.keys) {
                if (stack.isEmpty() || stack.removeLast() != closeBracketMap[charStr]) {
                    return false  // Invalid if no matching open bracket
                }
            }
        }

        return stack.isEmpty()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
