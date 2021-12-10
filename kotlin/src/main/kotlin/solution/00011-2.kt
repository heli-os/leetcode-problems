package solution

import kotlin.math.max
import kotlin.math.min

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
private fun maxArea(height: IntArray): Int {
    var answer = 0
    var left = 0
    var right = height.size - 1

    while (right - left > 0) {
        val calcHeight = min(height[left], height[right])
        val calcWidth = right - left
        answer = max(answer, calcHeight * calcWidth)

        if (height[left] > height[right]) {
            right -= 1
        } else {
            left += 1
        }
    }
    return answer
}

/**
 * n: none-negative integer
 */

fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)) == 49)
    println(maxArea(intArrayOf(1, 1)) == 1)
    println(maxArea(intArrayOf(4, 3, 2, 1, 4)) == 16)
    println(maxArea(intArrayOf(1, 2, 1)) == 2)
}
