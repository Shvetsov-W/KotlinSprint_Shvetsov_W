package lesson_1

fun main(args: Array<String>) {
    println("Количество заказов: $orderCounter")
    println(thanksForBuy)
    // println(numberOfEmployees)
    numberOfEmployees--  //1 работник уволился
    println("Количество работников: $numberOfEmployees")
}

var orderCounter: Int = 75
val thanksForBuy: String = "THANKS FOR PURCHASE - COME YET!"
var numberOfEmployees: Int = 2000


