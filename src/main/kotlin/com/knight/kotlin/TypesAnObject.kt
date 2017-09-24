package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/24.
 */

class 我是城市上海(坐标: String, 特色: String, 公园: String) : 城市(坐标, 特色, 公园)

class 我是城市北京( 坐标: String,  特色: String,  公园: String):城市(坐标, 特色, 公园)

open class 城市(var 坐标: String, var 特色: String, var 公园: String) {
    init {
        println("new了一个${this.javaClass.simpleName}，它的坐标：$坐标,特色：$特色，公园：$公园")
    }
}

fun main(args: Array<String>) {
    val 我是上海: 我是城市上海 = 我是城市上海("上海", "东方明珠", "中山公园")
    val 我是北京: 我是城市北京 = 我是城市北京("北京", "故宫", "圆明园")
}


