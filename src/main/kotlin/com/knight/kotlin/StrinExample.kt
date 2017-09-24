package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/21.
 */

//  var 修饰变的变量  val  修饰不可变的变量
//String 用 ""
val aString: String = "Hello World"
val bString: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'))

val aInt0: Int = 0
val aInt1: Int = 1

// Hello "Knight"
val sayHello: String = "Hello \"Knight\""


// $1000
val money: Int = 1000

fun main(args: Array<String>) {
    println("aString = " + aString)
    println("bStirng = " + bString)
    //  == 的意思  代表 Java 中的  equals() 方法  所以返回的是 true
    println(aString == bString)

    //  === 的意思  代表 Java 中的  == 方法   所以返回  false
    println(aString === bString)

    //看表达式是怎么样的
    println("" + aInt0 + "+" + aInt1 + "=" + (aInt0 + aInt1))
    println("$aInt0+$aInt1=${aInt0 + aInt1}")

    println(sayHello)

    println("$$money")
}