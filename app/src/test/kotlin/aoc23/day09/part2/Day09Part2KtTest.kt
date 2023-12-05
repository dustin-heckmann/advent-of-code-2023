package aoc23.day09.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day09Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(9)
        day09Part2(input) shouldBe 0
    }
})
