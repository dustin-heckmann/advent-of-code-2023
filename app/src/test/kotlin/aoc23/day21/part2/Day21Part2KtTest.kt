package aoc23.day21.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day21Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(21)
        day21Part2(input) shouldBe 0
    }
})
