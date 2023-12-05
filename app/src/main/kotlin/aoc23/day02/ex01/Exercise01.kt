package aoc23.day02.ex01

import util.getPuzzleInputForDay

val REFERENCE_CUBE_SET = CubeSet(red = 12, green = 13, blue = 14)

fun main() {
    val input = getPuzzleInputForDay(2)
    val result = sumOfPossibleGameIds(input)
    println(result)
}

fun sumOfPossibleGameIds(input: String) =
    input
        .lineSequence()
        .map { it.removePrefix("Game ") }
        .map { it.split(": ") }
        .associate { it[0].toInt() to it[1].split("; ").map(CubeSet::fromString) }
        .filterValues { sets -> sets.all { REFERENCE_CUBE_SET isSuperSetOf it } }
        .keys
        .sum()
