package lanugage.base

/**
 * @author yanghai
 * @since 2019-04-16 01:12
 */

/**
 * 在 Kotlin 中，所有东西都是对象，在这个意义上讲我们可以在任何变量上调用成员函数与属性。
 */

/**
 * kotlin的数字
Type	BitWidth
Double	64
Float	32
Long	64
Int	    32
Short	16
Byte	8
 */
//kotlin中字面常量
val oneMillon = 1_000_000
val creditNumber = 123_456_789
val socialSecurityNumber = 999_999_999L
val hexByte = 0xFF_EC_AB
val bytes = 0b11010010_01101001_10010100_10010010


/**
 * 数字装箱不保留同一性，但是保留相等性
 */
fun equalFun() {

    val a: Int = 10000
    val boxDA: Int? = a
    val anotherBoxA: Int? = a
    //同一性
    println(boxDA === anotherBoxA)
    println("========")
    //想等性
    print(boxDA == anotherBoxA)
}

/**
 * 显示转换
    每个数字类型支持如下的转换:
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
 */
fun convertDominant() {
//    val a: Int? = 1
//    var b: Long? = a  编译过不了
    val a: Int = 1
    val bytes = a.toByte()
    println(bytes)
    println("===========")
    val b: Long = a.toLong()
    println(b)
    println("===========")
}







