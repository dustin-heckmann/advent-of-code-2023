package aoc23.day07.part1

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(7)
    val result = day07Part1(input)
    println(result)
}

fun day07Part1(input: String): Int =
    input
        .lineSequence()
        .map { Hand.of(it) }
        .sorted()
        .withIndex()
        .sumOf { (index, hand) -> (index + 1) * hand.bid }
