package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/21.
 */


//   var 修饰可变变量
//   val 修饰不可变变量

//Boolean 布偶
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

//Int  整型   32位
val aInt: Int = 32
val anotherInt: Int = 12312
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

//Long 长整型  64
val aLong: Long = 1123132132142142141
val anotherLong: Long = 1L
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

//short  短整型   16
val aShort: Short = 21321
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

//float 单精度
val afloat: Float = 2.3F
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = Float.MIN_VALUE

//double 双精度
val aDouble: Double = 2.4
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE

//Byte 字节  8
val aByte: Byte = 127
val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE


fun main(args: Array<String>) {

    println("aBoolean =" + aBoolean)
    println("anotherBoolean =" + anotherBoolean)

    println("aInt = " + aInt)
    println("anotherInt = " + anotherInt)
    println("maxInt =" + maxInt)
    println("minInt =" + minInt)

    println("aLong =" + aLong)
    println("anotherLong =" + anotherLong)
    println("maxLong =" + maxLong)
    println("minLong =" + minLong)

    println("aShort = " + aShort)
    println("maxShort = " + maxShort)
    println("minShort = " + minShort)

    println("afloat = " + afloat)
    println("maxFloat =" + maxFloat)
    println("minFloat =" + minFloat)

    println("aDouble =" + aDouble)
    println("maxDouble =" + maxDouble)
    println("minDouble =" + minDouble)

    println("aByte =" + aByte)
    println("maxByte ="+ maxByte)
    println("minByte =" + minByte)

}
