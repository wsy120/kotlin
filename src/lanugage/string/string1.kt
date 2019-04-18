package lanugage.string

/**
 * @author yanghai
 * @since 2019-04-19 01:08
 */

fun stringTest1() {

//    //
//    val a = "abc"
//    a.forEach { println(it) }
//
//    println("==============")
//
//    //原始字符串 使用三个引号（"""）分界符括起来，内部没有转义并且可以包含换行以及任何其他字符
//    val text = """
//    |Tell me and I forget.
//    |Teach me and I remember.
//    |Involve me and I learn.
//    |(Benjamin Franklin)
//    """.trimMargin("|")
//    text.forEach { println(it) }

    //字符串模版
    val str = "123"
    println("str length is ${str.length}, and str content is $str")

    val doller = """
        ${'$'}999
    """.trimMargin()
    println(doller)


}