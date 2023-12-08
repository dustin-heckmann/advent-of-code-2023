package aoc23.day07.part2

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(7)
    val result = day07Part2(input)
    println(result)
}

fun day07Part2(input: String): Int =
    input
        .lineSequence()
        .map { Hand.of(it) }
        .sorted()
        .withIndex()
        .sumOf { (index, hand) -> (index + 1) * hand.bid }
