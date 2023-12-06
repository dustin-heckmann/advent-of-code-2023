package aoc23.day06.part1

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(6)
    val result = day06Part1(input)
    println(result)
}

fun day06Part1(input: String): Int =
    input.lines()
        .map { it.split(Regex(" +")) }
        .map { it.drop(1) }
        .map { it.map(String::toInt) }
        .let { (raceDurations, recordDistances) -> raceDurations zip recordDistances }
        .map { (raceDuration, recordDistance) ->
            (1 until raceDuration)
                .map { chargeDuration -> (raceDuration - chargeDuration) * chargeDuration }
                .count { it > recordDistance }
        }
        .reduce(Int::times)
