package aoc23.day08.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day08Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(8)
        day08Part2(input) shouldBe 0
    }
})
