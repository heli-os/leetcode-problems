package solution

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
var index: Int = 0
var maxLen: Int = 0
fun longestPalindrome(s: String): String {
    val len = s.length
    if (len < 2) {
        return s
    }
    for (i in 0 until len - 1) {
        find(s, i, i)
        find(s, i, i + 1)
    }
    return s.substring(index, index + maxLen)
}

fun find(s: String, i: Int, j: Int) {
    var min = i
    var max = j
    while (min >= 0 && max < s.length && s[min] == s[max]) {
        min -= 1
        max += 1
    }
    if (maxLen < max - min - 1) {
        index = min + 1
        maxLen = max - min - 1
    }
}

fun sut(s: String): String {
    index = 0
    maxLen = 0
    return longestPalindrome(s)
}

fun main() {
    println(sut("babad") == "bab")
    println(sut("cbbd") == "bb")
    println(sut("a") == "a")
    println(sut("ac") == "a")
    println(sut("ac") == "a")
}
