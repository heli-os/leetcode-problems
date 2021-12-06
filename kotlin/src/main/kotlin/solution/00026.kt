package solution

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
fun removeDuplicates(nums: IntArray): Int {
    var cnt = if (nums.isEmpty()) 0 else 1

    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) continue
        nums[cnt] = nums[i]
        cnt++
    }
    return cnt
}

fun main() {
    println(removeDuplicates(intArrayOf(1, 1, 2)) == 2)
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)) == 5)
}
