package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/24.
 */

val intArray: IntArray = intArrayOf(1, 3, 5, 7, 11, 13, 15, 17, 19, 21)
val charArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val array: ArrayList<String> = arrayListOf("Java", "Kotlin", "C++", "Html")

fun main(args: Array<String>) {
    println(intArray.size)//查看数组长度
    println(charArray.joinToString(""))//连接数组
    println(array[3])//根据下标拿到数组值
}