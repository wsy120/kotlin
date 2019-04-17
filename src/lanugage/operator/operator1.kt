package lanugage.operator

/**
 * @author yanghai
 * @since 2019-04-17 01:07
 */

/**
    重载一元运算符
 */

data class Point(val a: Int, val b: Int)

operator fun Point.unaryMinus() = Point(-a, -b)

fun operator1Test() {

    val point = Point(4, 5)
    println(-point)
}