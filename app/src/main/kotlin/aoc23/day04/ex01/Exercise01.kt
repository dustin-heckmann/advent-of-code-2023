package aoc23.day04.ex01

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(4)
    val result = sumOfCardPoints(input)
    println(result)
}

fun sumOfCardPoints(input: String): Int {
    return input
        .lineSequence()
        .map { Scratchcard.of(it) }
        .sumOf { it.points() }
}
