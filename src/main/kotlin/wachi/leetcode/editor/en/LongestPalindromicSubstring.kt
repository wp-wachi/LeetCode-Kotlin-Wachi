package wachi.leetcode.editor.en

//Given a string s, return the longest palindromic substring in s. 
//
// 
// Example 1: 
//
// 
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: s = "cbbd"
//Output: "bb"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consist of only digits and English letters. 
// 
//
// Related Topics Two Pointers String Dynamic Programming 👍 30436 👎 1874


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun longestPalindrome(s: String): String {
        // Create a 2D Boolean array dp[i][j] to store whether s[i:j+1] is a palindrome
        val dp = Array(s.length) { BooleanArray(s.length) }

        // Variables to store the starting index and length of the longest palindrome found
        var start = 0
        var maxLength = 1

        // Every single character is a palindrome (dp[i][i] = true)
        for (i in s.indices) {
            dp[i][i] = true
        }

        // Check two-character palindromes (e.g., "aa", "bb")
        for (i in 0 until s.length - 1) {
            if (s[i] == s[i + 1]) { // If two consecutive characters are the same
                dp[i][i + 1] = true  // Mark them as a palindrome
                start = i             // Update start index
                maxLength = 2          // Update max length to 2
            }
        }

        // Check for longer palindromes (length 3 to n)
        for (length in 3..s.length) { // Iterate over lengths from 3 to n
            for (i in 0 until s.length - length + 1) { // i is the starting index of the substring
                val j = i + length - 1 // j is the ending index of the substring

                // A substring s[i:j+1] is a palindrome if:
                // - s[i] == s[j] (the first and last characters match)
                // - dp[i+1][j-1] == true (the inner substring s[i+1:j] is already a palindrome)
                if (s[i] == s[j] && dp[i + 1][j - 1]) {
                    dp[i][j] = true  // Mark s[i:j+1] as a palindrome
                    start = i        // Update start index
                    maxLength = length // Update max palindrome length
                }
            }
        }

        // Extract and return the longest palindromic substring found
        return s.substring(start, start + maxLength)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
