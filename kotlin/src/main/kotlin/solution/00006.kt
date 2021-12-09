package solution

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
fun convert(s: String, numRows: Int): String {
    var direction = 0
    var zigzagIdx = 0
    val zigzagTable = mutableMapOf<Int, String>()
    s.forEach {
        if (zigzagIdx == 0) {
            direction = 1 // down(index plus)
        } else if(zigzagIdx == numRows - 1) {
            direction = -1 // up(index minus)
        }

        zigzagTable.set(
            key = zigzagIdx,
            value = zigzagTable.getOrDefault(zigzagIdx, "") +it
        )
        zigzagIdx += direction
    }
    return zigzagTable.values.joinToString("")
}

/**
 * PAYPALISHIRING
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *      n -> 3
 * line 1 -> P(0) A(4) H(8) N(12)
 * line 2 -> A(1) P(3) L(5) S(7) I(9) I(11) G(13)
 * line 3 -> Y(2) I(9) R(10)
 */

fun main() {
    println(convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")
    println(convert("PAYPALISHIRING", 4) == "PINALSIGYAHRPI")
    println(convert("A", 1) == "A")
}
