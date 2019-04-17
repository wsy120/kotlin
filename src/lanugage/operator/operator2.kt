package lanugage.operator

/**
 * @author yanghai
 * @since 2019-04-17 01:14
 */

/**
    重载二元运算符
    @link{https://www.kotlincn.net/docs/reference/operator-overloading.html}
 */

data class Counter(val incr:Int) {
    operator fun plus(inc :Int): Counter {
        return Counter(incr + inc)
    }
}

fun operator2Test() {
    val counter = Counter(2);
    var plus = counter.plus(2)
    println(plus)
}