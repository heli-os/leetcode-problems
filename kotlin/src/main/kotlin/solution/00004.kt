package solution

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedNums = mutableListOf<Int>()
    var idx1 = 0
    var idx2 = 0

    while (idx1 < nums1.size && idx2 < nums2.size) {
        if (nums1[idx1] < nums2[idx2]) {
            mergedNums.add(nums1[idx1])
            idx1 += 1
        } else {
            mergedNums.add(nums2[idx2])
            idx2 += 1
        }
    }

    if (idx1 != nums1.size) {
        while (idx1 < nums1.size) {
            mergedNums.add(nums1[idx1])
            idx1 += 1
        }
    } else {
        while (idx2 < nums2.size) {
            mergedNums.add(nums2[idx2])
            idx2 += 1
        }
    }

    return if (mergedNums.size <= 2) {
        mergedNums.average()
    } else {
        if (mergedNums.size % 2 == 0) {
            val medianIdx = mergedNums.size / 2
            (mergedNums[medianIdx - 1] + mergedNums[medianIdx]) / 2.0
        } else {
            mergedNums[mergedNums.size / 2].toDouble()
        }
    }
}

fun main() {
    println(
        findMedianSortedArrays(
            nums1 = arrayOf(1, 3).toIntArray(),
            nums2 = arrayOf(2).toIntArray()
        ) == 2.0
    )
    println(
        findMedianSortedArrays(
            nums1 = arrayOf(1, 2).toIntArray(),
            nums2 = arrayOf(3, 4).toIntArray()
        ) == 2.5
    )
    println(
        findMedianSortedArrays(
            nums1 = arrayOf(0, 0).toIntArray(),
            nums2 = arrayOf(0).toIntArray()
        ) == 0.0
    )
    println(
        findMedianSortedArrays(
            nums1 = emptyArray<Int>().toIntArray(),
            nums2 = arrayOf(1).toIntArray()
        ) == 1.0
    )
    println(
        findMedianSortedArrays(
            nums1 = arrayOf(2).toIntArray(),
            nums2 = emptyArray<Int>().toIntArray()
        ) == 2.0
    )
}
