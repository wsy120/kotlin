package lanugage.array

/**
 * @author yanghai
 * @since 2019-04-18 01:03
 */


/**
 *  kotlin中数组的声明
 */

/**
 * 范型
 */
interface Source<out T> {
    fun next(): T
}

fun sourceTest1(str: Source<String>) {
    val Ob: Source<Any> = str

}

fun arrTest() {

//    val arr = Array(5) { x -> (x * x).toString() }
//    arr.forEach { println(it) }

    /**
     * 注意: 与 Java 不同的是，Kotlin 中数组是不型变的（invariant）。
     * 这意味着 Kotlin 不让我们把 Array<String> 赋值给 Array<Any>，
     * 以防止可能的运行时失败
     */
    val arrInt: IntArray = intArrayOf(1, 2, 3, 4)
    arrInt.forEach { println(it) }

    val arrChar: CharArray = charArrayOf('1', '2', '3')
    arrChar.forEach { println(it) }

    /**
     * kotlin的范型
     */
    /*Java的范型
        // Java
        void demo(Source<String> strs) {
            Source<Object> objects = strs; // ！！！在 Java 中不允许
        }

        // Java
        void demo(Source<? extends Object> strs) {
            Source<Object> objects = strs; // ！！！在 Java 中不允许
        }
    */

}