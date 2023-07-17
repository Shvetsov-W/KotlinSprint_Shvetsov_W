package lesson_2

fun main() {
    val hourStart: Int = 9
    val minuteStart: Int = 39
    val travelTimeMinute: Int = 457
    println(calcArrivalTime(hourStart, minuteStart, travelTimeMinute))
}

fun calcArrivalTime(hourStart: Int, minuteStart: Int, travelTimeMinute: Int): String {
    val minutesPerDay: Int = 24 * 60
    val beginDayToStartMinutes: Int = hourStart * 60 + minuteStart
    val beginDayToFinishMinutes: Int = beginDayToStartMinutes + travelTimeMinute

    if (beginDayToFinishMinutes < minutesPerDay) return "Время прибытия: " +
            "${(beginDayToFinishMinutes / 60).likeDataTime()}:${(beginDayToFinishMinutes % 60).likeDataTime()}"
    else if (beginDayToFinishMinutes == minutesPerDay) return "Вермя прибытия: 00:00"
    else {
        var time: Int =  beginDayToFinishMinutes - minutesPerDay
        while (time > minutesPerDay) time -= minutesPerDay
        return  "Время прибытия: ${(time / 60).likeDataTime()}" +
                ":${(time % 60).likeDataTime()}"
    }


}
fun Int.likeDataTime(): String {
    return if (this <= 9) "0$this" else this.toString()
}



