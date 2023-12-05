package aoc23.day11.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day11Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(11)
        day11Part2(input) shouldBe 0
    }
})

