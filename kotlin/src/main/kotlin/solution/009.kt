package solution

/**
 * https://leetcode.com/problems/palindrome-number/
 */
fun isPalindrome(x: Int): Boolean {

    var variableX = x
    var reversedX: Int = 0

    while (0 < variableX) {
        val digit = variableX % 10
        reversedX = reversedX * 10 + digit
        variableX /= 10
    }

    return (x == reversedX)
}
