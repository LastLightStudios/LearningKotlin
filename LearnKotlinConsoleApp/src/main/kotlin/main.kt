package com.mypackage
import java.util.Scanner

fun timeInMinutesForResin(resin: Int): Int {
    return resin * 8;
}

fun convertMinutesOnlyToMinutesAndHours(time: Int): String{
    var hours = time / 60
    var minutes = time % 60
    return "$hours Hours and $minutes Minutes."
}

fun main(args: Array<String>) {
    println("Welcome")
    println("How much Resin do you need?")
    val scanner = Scanner(System.`in`)
    var inResin = scanner.nextInt()
    while (inResin < 1){
        println("Enter a positive number")
        println("How much Resin do you need?")
        inResin = scanner.nextInt()
    }

    var timeForResin = convertMinutesOnlyToMinutesAndHours(timeInMinutesForResin(inResin))
    println("It will take $timeForResin minutes")
}