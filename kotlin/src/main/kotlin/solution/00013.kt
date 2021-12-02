package solution

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
fun romanToInt(s: String): Int {
    var answer = 0
    for (i: Int in s.indices) {
        answer += if (i == s.length - 1) {
            RomanNumerals.get(s[i])
        } else {
            val current = RomanNumerals.get(s[i])
            val next = RomanNumerals.get(s[i + 1])
            if (current >= next) {
                +current
            } else {
                -current
            }
        }
    }
    return answer
}

object RomanNumerals {

    private val table = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun get(roman: Char): Int {
        return requireNotNull(table[roman])
    }
}

/**
 * I: 1
 * V: 5
 * X: 10
 * L: 50
 * C: 100
 * D: 500
 * M: 1000
 */

fun main() {
    println(romanToInt("III") == 3)
    println(romanToInt("IV") == 4)
    println(romanToInt("IX") == 9)
    println(romanToInt("LVIII") == 58)
    println(romanToInt("MCMXCIV") == 1994)
}
