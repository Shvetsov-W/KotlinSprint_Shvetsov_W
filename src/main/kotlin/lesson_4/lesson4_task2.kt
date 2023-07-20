package lesson_4
fun main() {
    val average: Average = Average()
    val cargo1: Cargo = Cargo(20, 80)
    val cargo2: Cargo = Cargo(50, 100)

    println(("Груз с весом ${cargo1.weight} кг и объемом ${cargo1.volume} л соответствует категории 'Average':" +
            "${(cargo1.weight >= average.minWeight || cargo1.weight <= average.maxWeight) && cargo1.volume < average.maxVolume}."))
    println(("Груз с весом ${cargo2.weight} кг и объемом ${cargo2.volume} л соответствует категории 'Average':" +
            "${(cargo2.weight >= average.minWeight || cargo2.weight <= average.maxWeight) && cargo2.volume < average.maxVolume}."))
}
data class Average(val minWeight: Int = 35, val maxWeight: Int = 100, val maxVolume: Int = 100)

data class Cargo(val weight: Int, val volume: Int)

