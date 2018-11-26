package com.example.tungtv.kotlinapplication

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

//similar switch case java
//when expression
fun describe(obj: Any): String =
        when (obj) {
            1,10 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            is Long -> "Long"
            !is String -> "Not a String"
            //similar default switch case
            else -> "Unknown"
        }

fun main(args: Array<String>) {
    println(sum(4, 5))
    println(sum1(4, 5))
    val a = 16
    val b = 22
    println("$a + $b = ${a + b}")

    val items = listOf("apple", "mango", "banana")

    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println(describe(1))
    println(describe(10))
    println(describe("Tictac"))

    //Ranges
    if (9 in 1..23) {
        print("fit in ranges")
    }
}

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}
