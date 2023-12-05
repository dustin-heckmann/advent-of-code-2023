package aoc23.day03.ex01

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(3)
    val result = sumOfEnginePartNumbers(input)
    println(result)
}

fun sumOfEnginePartNumbers(input: String): Int {
    val numbersByCoordinate = getNumbersByCoordinate(input)
    val potentialPartNumberCoordinates = getPotentialPartNumberCoordinates(input)
    return potentialPartNumberCoordinates
        .mapNotNull { numbersByCoordinate[it] }
        .toSet()
        .sumOf { it.value }
}

private fun getNumbersByCoordinate(input: String): Map<Coordinate, IdentityNumber> {
    val numberRegex = Regex("\\d+")
    return input
        .lineSequence()
        .map { numberRegex.findAll(it) }
        .flatMapIndexed { rowIndex, matches ->
            matches.flatMap { match ->
                val number = IdentityNumber(match.value.toInt())
                match.range.map { columnIndex -> Coordinate(rowIndex, columnIndex) to number }
            }
        }
        .toMap()
}

private fun getPotentialPartNumberCoordinates(input: String) =
    input
        .lineSequence()
        .flatMapIndexed { rowIndex, line ->
            line
                .toCharArray()
                .withIndex()
                .filter { it.value.isSymbol() }
                .map { it.index }
                .map { columnIndex -> Coordinate(rowIndex, columnIndex) }
                .flatMap { it.adjacentCoordinates() }
        }
        .toSet()

fun Char.isSymbol() = !equals('.') && !isDigit()
