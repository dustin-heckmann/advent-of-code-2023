package aoc23.day05.ex01

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day05/input.txt")
    val result = lowestLocationNumber(input)
    println(result)
}

fun lowestLocationNumber(input: String): Long {
    val mappings = extractMappings(input)
    return extractSeeds(input).minOf { seed ->
        mappings.fold(seed) { source, mapping ->
            mapping.mapToDestination(source)
        }
    }
}

private fun extractMappings(input: String): List<Mapping> =
    Regex(":\\n([\\d \\n]+)")
        .findAll(input)
        .map { it.groups[1]!!.value.trim() }
        .map { Mapping.of(it) }
        .toList()

private fun extractSeeds(input: String): List<Long> =
    input
        .lineSequence()
        .first()
        .substringAfter(": ")
        .split(" ")
        .map { it.toLong() }
