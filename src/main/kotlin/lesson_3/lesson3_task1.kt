package lesson_3

fun main() {
    val name: String = "Victor"
    var greeting: String = outputGreeting(name, TimeOfDay.DAY)
    println(greeting)
    greeting = outputGreeting(name, TimeOfDay.NIGHT)
    println(greeting)
}

fun outputGreeting(name: String, timeOfDay: TimeOfDay): String {
  return  when(timeOfDay) {
      TimeOfDay.DAY -> "Доброго дня $name!"
      TimeOfDay.NIGHT -> "Доброй ночи $name!"
    }
}

enum class TimeOfDay {
    DAY, NIGHT
}


