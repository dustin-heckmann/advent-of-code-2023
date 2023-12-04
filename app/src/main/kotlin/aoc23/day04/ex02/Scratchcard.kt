package aoc23.day04.ex02

data class Scratchcard(val id: Int, private val winningNumbers: Set<Int>, private val yourNumbers: Set<Int>) {
    fun idsOfCardsWon(): Set<Int> {
        val numberOfMatches = winningNumbers.intersect(yourNumbers).size
        return ((id + 1)..(id + numberOfMatches)).toSet()
    }

    companion object {
        fun of(line: String): Scratchcard {
            val id = line.substringBefore(":").substringAfter("Card").trim().toInt()
            val numberSets = line.substringAfter(": ")
                .split("|")
                .map { pointsList ->
                    pointsList
                        .trim()
                        .split(Regex(" +"))
                }
                .map { it.map(String::toInt) }
                .map(List<Int>::toSet)
            return Scratchcard(id, numberSets[0], numberSets[1])
        }
    }
}
