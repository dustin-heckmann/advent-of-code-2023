package aoc23.day03.ex02

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day03/input.txt")
    val result = sumOfGearRatios(input)
    println(result)
}

fun sumOfGearRatios(input: String): Int {
    val numbersByCoordinate = getNumbersByCoordinate(input)
    val asteriskAdjacentCoordinateLists = getAsteriskAdjacentCoordinateLists(input)
    return asteriskAdjacentCoordinateLists
        .map { coordinates -> coordinates.mapNotNull { numbersByCoordinate[it] }.toSet() }
        .filter { it.size == 2 }
        .map { it.reduce(Int::times) }
        .sum()
}

private fun getNumbersByCoordinate(input: String): Map<Coordinate, Int> {
    val numberRegex = Regex("\\d+")
    return input
        .lineSequence()
        .map { numberRegex.findAll(it) }
        .flatMapIndexed { row, matches ->
            matches.flatMap { match ->
                val number = match.value.toInt()
                match.range.map { column -> Coordinate(row, column) to number }
            }
        }
        .toMap()
}

private fun getAsteriskAdjacentCoordinateLists(input: String): Sequence<List<Coordinate>> =
    input
        .lineSequence()
        .flatMapIndexed { row, line ->
            line
                .toCharArray()
                .withIndex()
                .filter { it.value == '*' }
                .map { (column, _) -> Coordinate(row, column) }
                .map { it.adjacentCoordinates() }
        }
