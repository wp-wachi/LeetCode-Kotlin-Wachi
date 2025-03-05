package wachi.leetcode.editor.en

//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lowercase English letters if it is non-empty. 
// 
//
// Related Topics String Trie 👍 18812 👎 4693


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var output = ""

        for (i in strs.first().indices) {
            val commonPrefix = output + strs.first()[i].toString()
            if (strs.all {
                    it.startsWith(commonPrefix)
                }) {
                output = commonPrefix
            } else {
                break
            }
        }

        return output
    }
}
//leetcode submit region end(Prohibit modification and deletion)
