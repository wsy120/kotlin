package lanugage

/**
 * @author yanghai
 * @since 2019-04-16 00:40
 */

fun templateStr() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s1)
    println()
    println(s2)
}