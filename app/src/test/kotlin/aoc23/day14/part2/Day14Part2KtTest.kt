package aoc23.day14.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day14Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(14)
        day14Part2(input) shouldBe 0
    }
})
