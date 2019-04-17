package lanugage.char

import java.lang.IllegalArgumentException

/**
 * @author yanghai
 * @since 2019-04-17 01:26
 */

fun convertToInt(a: Char): Int {

    if (a !in '0'..'9') {
        throw IllegalArgumentException("out of range")
    }
    return a.toInt() - '0'.toInt()
}

fun convertToIntTest() {
    var convertToInt = convertToInt('1')
    println(convertToInt)
}