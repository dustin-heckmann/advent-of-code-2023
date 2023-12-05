package aoc23.day11.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day11Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(11)
        day11Part1(input) shouldBe 0
    }
})

