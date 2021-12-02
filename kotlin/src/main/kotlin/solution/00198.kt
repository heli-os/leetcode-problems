package solution

import java.util.Collections.max

fun rob(nums: IntArray): Int {
    var previous = 0
    var answer = 0

    for (i: Int in nums.indices) {
        val originAnswer = answer
        answer = max(listOf(previous + nums[i], answer))
        previous = originAnswer
    }

    return answer
}

/**
 * 1, 2, 3, 1: 4 -> 1 + 3 / [1] + [3]
 * 4, 1, 2, 7, 5, 3, 1: 14 -> 4 + 7 + 3 / [0] + [3] + [5]
 *
 * 0: self
 * 1: max(0.value, self)
 * 2: max(0.value + self, 1.value)
 *
 * finalize-answer: last-value
 */

fun main() {
    println(rob(arrayOf(1, 2, 3, 1).toIntArray()) == 4)
    println(rob(arrayOf(2, 7, 9, 3, 1).toIntArray()) == 12)
    println(rob(arrayOf(2, 1, 1, 2).toIntArray()) == 4)
    println(rob(arrayOf(1).toIntArray()) == 1)
    println(rob(arrayOf(1, 1).toIntArray()) == 1)
    println(rob(arrayOf(4, 1, 2, 7, 5, 3, 1).toIntArray()) == 14)
}
