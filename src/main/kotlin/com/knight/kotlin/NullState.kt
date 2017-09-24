package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/24.
 */

fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
//    val name: String = getName() ?: return
//    println(name?.length)

    val value: String? = "HelloWrold"
    println(value!!.length)

}