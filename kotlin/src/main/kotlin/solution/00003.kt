package solution

import kotlin.math.max

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
fun lengthOfLongestSubstring(s: String): Int {
    if (s.length <= 1) return s.length

    var answer = 0
    val charList = emptyList<Char>().toMutableList()
    s.forEach {
        if (charList.contains(it)) {
            answer = max(answer, charList.size)
            charList.subList(0, charList.indexOf(it) + 1).clear()
        }
        charList.add(it)
    }
    return max(answer, charList.size)
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb") == 3)
    println(lengthOfLongestSubstring("bbbbb") == 1)
    println(lengthOfLongestSubstring("pwwkew") == 3)
    println(lengthOfLongestSubstring("") == 0)
    println(lengthOfLongestSubstring(" ") == 1)
    println(lengthOfLongestSubstring("au") == 2)
    println(lengthOfLongestSubstring("dvdf") == 3)
    println(lengthOfLongestSubstring("ckilbkd") == 5)
}
