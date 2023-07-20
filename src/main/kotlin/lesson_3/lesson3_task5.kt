package lesson_3

fun main() {
    val serverData: String = "D2-D4;0"
    val (start, finish, movesNumber) = readData(serverData)
    println(
        """start = $start
        |finish = $finish
        |movesNumber = $movesNumber
    """.trimMargin()
    )
}

data class ChessData(val start: String, val finish: String, val moveNumber: Int)

fun readData(data: String): ChessData {
    val charData: CharArray = data.toCharArray()
    return ChessData("${charData[0]}${charData[1]}", "${charData[3]}${charData[4]}", charData[6].digitToInt())
}


