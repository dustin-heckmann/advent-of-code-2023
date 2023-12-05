package aoc23.day05.ex02

import kotlinx.coroutines.*
import util.readResourceFile

suspend fun main() {
    val input = readResourceFile("/day05/input.txt")
    val result = lowestLocationNumber(input)
    println(result)
}

suspend fun lowestLocationNumber(input: String): Long {
    val mappings = Regex(":\\n([\\d \\n]+)")
        .findAll(input)
        .map { it.groups[1]!!.value.trim() }
        .map { Mapping.of(it) }
        .toList()

    return input
        .lineSequence()
        .first()
        .substringAfter(": ")
        .split(" ")
        .map { it.toLong() }
        .chunked(2)
        .mapParallel { (start, length) -> minOfRange(start, length, mappings) }
        .min()
}

fun minOfRange(start: Long, length: Long, mappings: List<Mapping>): Long =
    (start until start + length)
        .minOf { seed ->
            mappings.fold(seed) { acc, mapping ->
                mapping.mapToDestination(acc)
            }
        }

suspend fun <A, B> Iterable<A>.mapParallel(f: suspend (A) -> B): List<B> = coroutineScope {
    map { async { f(it) } }.awaitAll()
}
