package aoc23.day07.part2

import aoc23.day07.part2.HandType.*

data class Hand(val cards: String, val bid: Int) : Comparable<Hand> {
    companion object {
        private const val order = "J23456789TQKA"

        fun of(string: String) =
            string.split(" ")
                .let { (a, b) -> Hand(a, b.toInt()) }
    }

    private fun type(): HandType =
        if ('J' in cards) {
            order
                .filter { it != 'J' }
                .map { copy(cards = cards.replace('J', it)) }
                .maxOf { it.type() }
        } else
            when (cardFrequencies()) {
                listOf(5) -> FIVE_OF_A_KIND
                listOf(4, 1) -> FOUR_OF_A_KIND
                listOf(3, 2) -> FULL_HOUSE
                listOf(3, 1, 1) -> THREE_OF_A_KIND
                listOf(2, 2, 1) -> TWO_PAIR
                listOf(2, 1, 1, 1) -> ONE_PAIR
                else -> High_CARD
            }

    private fun cardFrequencies() =
        cards
            .groupingBy { it }
            .eachCount()
            .values
            .sortedDescending()

    override fun compareTo(other: Hand): Int {
        return when {
            type() > other.type() -> 1
            type() < other.type() -> -1
            else ->
                (cards.map { order.indexOf(it) } zip other.cards.map { order.indexOf(it) })
                    .filter { it.first != it.second }
                    .firstOrNull()
                    ?.let { it.first.compareTo(it.second) }
                    ?: 0
        }
    }
}