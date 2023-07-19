package lesson_2

fun main() {
    val hourStart: Int = 9
    val minuteStart: Int = 39
    val travelTimeMinute: Int = 10
    println(calcArrivalTime(hourStart, minuteStart, travelTimeMinute))
}

fun calcArrivalTime(hourStart: Int, minuteStart: Int, travelTimeMinute: Int): String {
    val minPerHour: Int = 60
    val minutesPerDay: Int = 24 * minPerHour
    val beginDayToArrivalTrain: Int = hourStart * minPerHour + minuteStart + travelTimeMinute

    // Проверка на случай поездки длинною более 24 часов
    if (beginDayToArrivalTrain < minutesPerDay) return String.format("Время прибытия: %02d:%02d",
        beginDayToArrivalTrain / minPerHour, beginDayToArrivalTrain % minPerHour)
    else if (beginDayToArrivalTrain == minutesPerDay) return "Время прибытия: 00:00"
    else {
        var time: Int =  beginDayToArrivalTrain - minutesPerDay
        while (time > minutesPerDay) time -= minutesPerDay
        return  String.format("Время прибытия: %02d:%02d",
            time / minPerHour, time % minPerHour)
    }

}



