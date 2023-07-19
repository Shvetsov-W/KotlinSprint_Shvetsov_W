package lesson_3

fun main() {
    var start: String = "E${2}"
    var finish: String = "E${4}"
    var movesNumber: Int = 1

    var str: String = "$start-$finish;$movesNumber"
    println(str)

    start = "G${2}"
    finish = "G${4}"
    movesNumber = 2

    str= "$start-$finish;$movesNumber"
    println(str)

    start = "D${2}"
    finish = "D${2+1}"
    movesNumber = 3

    str= "$start-$finish;$movesNumber"
    println(str)

}