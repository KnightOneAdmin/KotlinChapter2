package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/24.
 */


fun main(args: Array<String>) {
//    val parent: Parent = Child()
//    if (parent is Child) {
//        println(parent.name)
//    }

    val parent: Parent = Parent()

    val child: Child? = parent as? Child
    println(child)


    val value: String? = "HelloWorld"
    if (value is String)
        println(value.length)
}