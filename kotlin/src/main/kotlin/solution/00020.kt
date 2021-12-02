package solution

import java.util.*

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
fun isValid(s: String): Boolean {
    val stack = Stack<String>()

    s.forEach {
        val currentBracket = it.toString()

        if (currentBracket.isOpenedBracket()) {
            stack.push(currentBracket)
        } else {
            if (stack.isEmpty()) return false
            
            val lastBracket = stack.pop()
            if (lastBracket.isClosedBracket() || !currentBracket.isMatchedBracket(lastBracket)) {
                return false
            }
        }
    }
    return stack.isEmpty()
}

private fun String.isOpenedBracket() = listOf("(", "[", "{").contains(this)
private fun String.isClosedBracket() = listOf(")", "]", "}").contains(this)
private fun String.isMatchedBracket(bracket: String) =
    this == "(" && bracket == ")" || this == ")" && bracket == "(" ||
            this == "[" && bracket == "]" || this == "]" && bracket == "[" ||
            this == "{" && bracket == "}" || this == "}" && bracket == "{"


fun main() {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(!isValid("(]"))
    println(!isValid("([)]"))
    println(isValid("{[]}"))
    println(!isValid("]"))
}
