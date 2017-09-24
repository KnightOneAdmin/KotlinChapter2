package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/24.
 */


val intRange: IntRange = 0..1024   //[0-1024]
val range_other: IntRange = 0 until 1024   //[0-2013)
val range_empty: IntRange = 0..-1

fun main(args: Array<String>) {
    println(intRange.contains(10))
    println(range_empty.isEmpty())

    for (i in range_other){
        print("$i,")
    }
}