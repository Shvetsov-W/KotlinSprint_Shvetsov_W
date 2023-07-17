package lesson_2
fun main() {
    val grades = listOf<Int>(3,4,3,5)
    println("Средняя оценка: %.2f".format(grades.mean()))
}

fun List<Int>.mean(): Double{
    var sum: Int = 0
    for (element in this)  sum += element
    return (sum.toDouble() / this.size)

}
