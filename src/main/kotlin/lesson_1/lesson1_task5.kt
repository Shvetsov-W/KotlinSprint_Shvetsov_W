package lesson_1

fun main() {
    val numberOfSeconds: Int = 6480
    val (minute: Int, remainderSecond: Int) = secondToMinute(6480)
    val (hour: Int, remainderMinute: Int) = minuteToHour(minute)
    println("Время, проведенное в космосе: ${hour.likeDataTime()}:${remainderMinute.likeDataTime()}:${remainderSecond.likeDataTime()}")
}

fun secondToMinute(second: Int) = ReturnedValue(second / 60, second % 60)

fun minuteToHour(minute: Int) = ReturnedValue(minute / 60, minute % 60)

fun Int.likeDataTime(): String{
    if (this <= 9) return "0$this"
    else return "$this"
}

data class ReturnedValue(val value: Int, val remainder: Int) {

}