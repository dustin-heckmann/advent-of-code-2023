package aoc23.day04.ex01

import kotlin.math.pow

data class Scratchcard(private val winningNumbers: Set<Int>, private val yourNumbers: Set<Int>) {
    fun points(): Int {
        val matches = winningNumbers intersect yourNumbers
        return if (matches.isEmpty()) {
            0
        } else {
            2.0.pow(matches.size - 1).toInt()
        }
    }

    companion object {
        fun of(line: String): Scratchcard {
            val numberSets = line.substringAfter(": ")
                .split("|")
                .map { pointsList ->
                    pointsList
                        .trim()
                        .split(Regex(" +"))
                }
                .map { it.map(String::toInt) }
                .map(List<Int>::toSet)
            return Scratchcard(numberSets[0], numberSets[1])
        }
    }
}
