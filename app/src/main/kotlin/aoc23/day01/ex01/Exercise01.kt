package aoc23.day01.ex01

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day01/input.txt")
    val result = calibrationValuesSum(input)
    println(result)
}

fun calibrationValuesSum(input: String) =
    input
        .lineSequence()
        .map { it.filter(Char::isDigit) }
        .sumOf { 10 * it.first().digitToInt() + it.last().digitToInt() }
