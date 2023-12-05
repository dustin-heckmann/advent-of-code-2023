package aoc23.day02.ex02

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(2)
    val result = sumOfSmallestSuperSetPowers(input)
    println(result)
}

fun sumOfSmallestSuperSetPowers(input: String) =
    input
        .lineSequence()
        .map { it.substringAfter(": ") }
        .map { it.split("; ").map(CubeSet::fromString) }
        .map { it.reduce(CubeSet::smallestCommonSuperSetWith) }
        .sumOf { it.power() }
