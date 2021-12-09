package solution

import kotlin.math.abs
import kotlin.math.pow

fun reverse(x: Int): Int {
    var answer = 0
    var xNum = x
    var cnt = abs(x).toString().length - 1

    while (xNum != 0) {
        val accNum = (xNum % 10) * 10.0.pow(cnt)
        if (answer + accNum > Integer.MAX_VALUE || answer + accNum < Integer.MIN_VALUE) {
            return 0
        }
        answer += accNum.toInt()
        xNum /= 10
        cnt--
    }

    return answer
}

fun main() {
    println(reverse(123) == 321)
    println(reverse(-123) == -321)
    println(reverse(120) == 21)
    println(reverse(0) == 0)
    println(reverse(1534236469) == 0)
    println(reverse(-2147483648) == 0)
    println(reverse(1563847412) == 0)
}
