package wachi.leetcode.editor.en

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun isPalindrome(x: Int): Boolean {
        // negative number and number ending with 0 except 0 cannot be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var original = x
        var reversedHalf = 0

        // reverse half
        while (original > reversedHalf) {
            reversedHalf = reversedHalf * 10 + original % 10
            original /= 10
        }

        // check original is equal reversedHalf
        return original == reversedHalf || original == reversedHalf / 10
    }
}
//leetcode submit region end(Prohibit modification and deletion)
