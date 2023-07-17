package lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("""Год: $year
        |Час: ${hour.printLikeDataTime()}
        |Минута: ${minute.printLikeDataTime()}""".trimMargin())

    hour = 10
    minute = 55

    print("Время посадки: ${hour.printLikeDataTime()}:${minute.printLikeDataTime()}")
}

fun Int.printLikeDataTime(arg: Int = this): String {
    if (arg <= 9) return "0$arg"
    else return arg.toString()
}