package solution

import kotlin.math.max
import kotlin.math.min

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
private fun maxArea(height: IntArray): Int {
    var answer = 0
    height.forEachIndexed { index, left ->
        for (j: Int in index + 1 until height.size) {
            val right = height[j]
            val calcHeight = min(right, left)
            val calcWidth = j - index
            answer = max(answer, calcHeight * calcWidth)
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
