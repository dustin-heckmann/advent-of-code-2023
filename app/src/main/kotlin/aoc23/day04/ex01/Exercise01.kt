package aoc23.day04.ex01

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day04/input.txt")
    val result = sumOfCardPoints(input)
    println(result)
}

fun sumOfCardPoints(input: String): Int {
    return input
        .lineSequence()
        .map { Scratchcard.of(it) }
        .sumOf { it.points() }
}
