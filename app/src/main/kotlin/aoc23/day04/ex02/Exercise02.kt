package aoc23.day04.ex02

import util.readResourceFile

fun main() {
    val input = readResourceFile("/day04/input.txt")
    val result = numberOfScratchcardsWon(input)
    println(result)
}

fun numberOfScratchcardsWon(input: String): Int {
    val scratchcards = input.lines().map { Scratchcard.of(it) }
    val counts = scratchcards.associate { it.id to 1 }.toMutableMap()
    scratchcards.forEach { card ->
        card.idsOfCardsWon().forEach { idOfCardWon ->
            counts[idOfCardWon] = counts[idOfCardWon]!! + counts[card.id]!!
        }
    }
    return counts.values.sum()
}
