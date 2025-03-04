package wachi.leetcode.editor.en

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[num] = i
        }
        return intArrayOf()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
