package com.mypackage

fun timeInMinutesForResin(resin: Int): Int {
    return resin * 8;
}

fun main(args: Array<String>) {
    println("Welcome")
    println("How much Resin do you need")
    val inResin = 50
    var timeForResin = timeInMinutesForResin(inResin).toString()
    println("It will take $timeForResin minutes")
}