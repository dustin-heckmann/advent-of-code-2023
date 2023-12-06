package aoc23.day06.part2

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(6)
    val result = day06Part2(input)
    println(result)
}

fun day06Part2(input: String): Int =
    input.lines()
        .map { it.split(Regex(" +")) }
        .map { it.drop(1) }
        .map { it.joinToString("") }
        .map { it.toLong() }
        .let { (raceDuration, recordDistance) ->
            (1L until raceDuration)
                .map { chargeDuration -> (raceDuration - chargeDuration) * chargeDuration }
                .count { it > recordDistance }
        }
