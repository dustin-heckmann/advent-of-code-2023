package aoc23.day18.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day18Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(18)
        day18Part2(input) shouldBe 0
    }
})
