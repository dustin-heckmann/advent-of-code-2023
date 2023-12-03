package aoc23.day03.ex01

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day03/input.txt")
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
        .flatMapIndexed { row, matches ->
            matches.flatMap { match ->
                val number = IdentityNumber(match.value.toInt())
                match.range.map { column -> Coordinate(row, column) to number }
            }
        }
        .toMap()
}

private fun getPotentialPartNumberCoordinates(input: String) =
    input
        .lineSequence()
        .flatMapIndexed { row, line ->
            line
                .toCharArray()
                .withIndex()
                .filter { it.value.isSymbol() }
                .map { (column, _) -> Coordinate(row, column) }
                .flatMap { it.adjacentCoordinates() }
        }
        .toSet()

fun Char.isSymbol() = !equals('.') && !isDigit()
