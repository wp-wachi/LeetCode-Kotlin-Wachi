package wachi.leetcode.editor.en

//Given a string s consisting of words and spaces, return the length of the 
//last word in the string. 
//
// A word is a maximal substring consisting of non-space characters only. 
//
// 
// Example 1: 
//
// 
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
// 
//
// Example 2: 
//
// 
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
// 
//
// Example 3: 
//
// 
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of only English letters and spaces ' '. 
// There will be at least one word in s. 
// 
//
// Related Topics String 👍 5646 👎 320


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var lastWord = ""
        var foundSpace = false
        for (i in s.indices) {
            if (s[i] == ' ') {
                foundSpace = true
            } else {
                if (foundSpace) {
                    lastWord = s[i].toString()
                } else {
                    lastWord += s[i]
                }
                foundSpace = false
            }
        }
        return lastWord.length
    }
}
//leetcode submit region end(Prohibit modification and deletion)
