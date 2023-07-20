package lesson_4

fun main() {
    val isSunny: Boolean = true
    val isOpenTent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isOpenTent && airHumidity == 20 && season != "зима"}")
}
