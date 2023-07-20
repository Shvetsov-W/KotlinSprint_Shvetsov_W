package lesson_4

fun main() {
    var reservedToday: Int = 13
    var reservedTomorrow: Int = 9

    checkReserve(reservedToday, reservedTomorrow)
}

fun checkReserve(reservedToday: Int, reservedTomorrow: Int, numberOfTables: Int = 13) {
    println("[Доступность столиков на сегодня:${reservedToday < numberOfTables}]")
    println("[Доступность столиков на завтра:${reservedTomorrow < numberOfTables}]")
}