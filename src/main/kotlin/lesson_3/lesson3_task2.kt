package lesson_3

fun main() {
    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("$lastName $firstName $patronymic, $age")
    age = 22
    lastName = "Сидорова"
    println("$lastName $firstName $patronymic, $age")
}
