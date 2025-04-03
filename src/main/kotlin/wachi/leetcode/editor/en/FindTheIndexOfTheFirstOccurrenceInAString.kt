package wachi.leetcode.editor.en

//Given two strings needle and haystack, return the index of the first 
//occurrence of needle in haystack, or -1 if needle is not part of haystack. 
//
// 
// Example 1: 
//
// 
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
// 
//
// Example 2: 
//
// 
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
// 
//
// 
// Constraints: 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack and needle consist of only lowercase English characters. 
// 
//
// Related Topics Two Pointers String String Matching 👍 6583 👎 485


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val needleLength = needle.length
        for (i in haystack.indices) {
            if (haystack.length - i >= needleLength) {
                val subString = haystack.substring(i, needleLength + i)
                if (subString == needle) return  i
            }
        }
        return -1
    }
}
//leetcode submit region end(Prohibit modification and deletion)
