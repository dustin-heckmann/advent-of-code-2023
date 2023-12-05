package aoc23.day04.ex02

import util.getPuzzleInputForDay

fun main() {
    val input = getPuzzleInputForDay(4)
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
