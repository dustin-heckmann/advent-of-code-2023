package aoc23.day05.ex01

data class MappingRange(val destinationStart: Long, val sourceStart: Long, val length: Long) {
    operator fun contains(source: Long): Boolean = source in sourceStart until sourceStart + length

    fun mapToDestination(source: Long): Long =
        destinationStart + (source - sourceStart)

    companion object {
        fun of(string: String) =
            string
                .split(" ")
                .map { it.toLong() }
                .let { MappingRange(it[0], it[1], it[2]) }
    }
}
