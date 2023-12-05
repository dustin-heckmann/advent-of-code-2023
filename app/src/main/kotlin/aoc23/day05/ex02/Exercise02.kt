package aoc23.day05.ex02

import kotlinx.coroutines.*
import util.readResourceFile

suspend fun main() {
    val input = readResourceFile("/day05/input.txt")
    val result = lowestLocationNumber(input)
    println(result)
}

suspend fun lowestLocationNumber(input: String): Long {
    val mappings = extractMappings(input)
    return extractSeedRanges(input)
        .mapParallel { range -> minOfRange(range, mappings) }
        .min()
}

private fun extractSeedRanges(input: String): List<LongRange> =
    input
        .lineSequence()
        .first()
        .substringAfter(": ")
        .split(" ")
        .map { it.toLong() }
        .chunked(2)
        .map { (start, length) -> start until start + length }

private fun extractMappings(input: String): List<Mapping> =
    Regex(":\\n([\\d \\n]+)")
        .findAll(input)
        .map { it.groups[1]!!.value.trim() }
        .map { Mapping.of(it) }
        .toList()

fun minOfRange(range: LongRange, mappings: List<Mapping>): Long =
    range
        .minOf { seed ->
            mappings.fold(seed) { acc, mapping ->
                mapping.mapToDestination(acc)
            }
        }

suspend fun <A, B> Iterable<A>.mapParallel(f: suspend (A) -> B): List<B> = coroutineScope {
    map { async { f(it) } }.awaitAll()
}
