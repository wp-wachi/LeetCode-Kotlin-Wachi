package wachi.leetcode.editor.en

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = hashMapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
        var total = 0

        for (i in s.indices) {
            val romanNum = romanMap[s[i].toString()] ?: 0
            if (i < s.length - 1 && romanNum < (romanMap[s[i + 1].toString()] ?: 0)) {
                total -= romanNum
            } else {
                total += romanNum
            }
        }
        return total
    }
}
//leetcode submit region end(Prohibit modification and deletion)
