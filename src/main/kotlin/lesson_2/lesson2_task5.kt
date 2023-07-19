package lesson_2

import java.util.*
import kotlin.math.pow

fun main() {
    val initialSum: Int = 70_000
    val interestRate: Double = 16.7
    val years: Int = 20
    val result: Double = compoundInterest(initialSum,  interestRate, 20)
    println(String.format(Locale.ROOT,"Размер вклада через 20 лет: %.3f", result))

}

fun compoundInterest(initialSum: Int, percent: Double, years: Int): Double {
    return initialSum * (1 + percent / 100).pow(years)
}
