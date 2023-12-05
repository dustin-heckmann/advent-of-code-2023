package aoc23.day05.ex01

data class Mapping(private val ranges: List<MappingRange>) {
    fun mapToDestination(source: Long): Long =
        ranges
            .find { source in it }
            ?.mapToDestination(source)
            ?: source

    companion object {
        fun of(string: String) = string
            .lines()
            .map { MappingRange.of(it) }
            .let { Mapping(it) }
    }
}
