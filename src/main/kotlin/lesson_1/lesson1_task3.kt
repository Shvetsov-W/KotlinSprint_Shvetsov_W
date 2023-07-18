package lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println("""Год: $year
        |Час: $hour
        |Минута: $minute""".trimMargin())

    hour = "10"
    minute = "55"

    print("Время посадки: $hour:$minute")
}
