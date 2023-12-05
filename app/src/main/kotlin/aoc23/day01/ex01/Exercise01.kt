package aoc23.day01.ex01

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(1)
    val result = calibrationValuesSum(input)
    println(result)
}

fun calibrationValuesSum(input: String) =
    input
        .lineSequence()
        .map { it.filter(Char::isDigit) }
        .sumOf { 10 * it.first().digitToInt() + it.last().digitToInt() }
