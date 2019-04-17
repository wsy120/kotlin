package lanugage

/**
 * @author yanghai
 * @since 2019-04-16 00:45
 */

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 上面的maxOf方法类的kotlin函数式表达方式
 */

fun maxOfFunc(a: Int, b: Int) = if (a > b) a else b