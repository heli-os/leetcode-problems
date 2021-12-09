package solution

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
fun myAtoi(s: String): Int {
    var answer = ""

    var isFirstLeading = true
    var signNumber = 0
    for (i: Int in s.indices) {
        val ch = s[i]

        if (isFirstLeading && ch == ' ') {
            continue
        } else {
            isFirstLeading = false
        }

        if (signNumber == 0) {
            if (ch == '-') {
                signNumber = -1
                continue
            } else if (ch == '+') {
                signNumber = 1
                continue
            } else {
                signNumber = 1
            }
        }

        if (ch.isDigit()) {
            answer += ch
        } else if (signNumber != 0) {
            break
        }
    }

    return if (answer.isEmpty()) {
        0
    } else {
        if (answer.toBigInteger() > Int.MAX_VALUE.toBigInteger()) {
            if (signNumber == -1) Int.MIN_VALUE
            else Int.MAX_VALUE
        } else {
            answer.toInt() * signNumber
        }
    }
}

fun main() {
    println(myAtoi("42") == 42)
    println(myAtoi("   -42") == -42)
    println(myAtoi("4193 with words") == 4193)
    println(myAtoi("words and 987") == 0)
    println(myAtoi("-91283472332") == -2147483648)
    println(myAtoi("3.14159") == 3)
    println(myAtoi("+-12") == 0)
}
