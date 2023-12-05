package aoc23.day05.ex01

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day05/input.txt")
    val result = lowestLocationNumber(input)
    println(result)
}

fun lowestLocationNumber(input: String): Long {
    val seeds = input
        .lineSequence()
        .first()
        .substringAfter(": ")
        .split(" ")
        .map { it.toLong() }

    val mappings = Regex(":\\n([\\d \\n]+)")
        .findAll(input)
        .map { it.groups[1]!!.value.trim() }
        .map { Mapping.of(it) }
        .toList()

    return seeds.minOf { seed ->
        mappings.fold(seed) { acc, mapping ->
            mapping.mapToDestination(acc)
        }
    }
}
