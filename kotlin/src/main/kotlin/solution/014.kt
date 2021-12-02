package solution

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) return strs.first()

    var answer = ""

    val sortedStrs = strs.sortedBy { it.length }
    val firstStr = sortedStrs.first()

    for (i: Int in firstStr.indices) {
        val currentChar = firstStr[i]
        if (sortedStrs.all { it[i] == currentChar }) {
            answer += currentChar
        } else {
            return answer
        }
    }

    return answer
}


fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")) == "fl")
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")) == "")
    println(longestCommonPrefix(arrayOf("a")) == "a")
    println(longestCommonPrefix(arrayOf("flower", "flower", "flower", "flower")) == "flower")
}
