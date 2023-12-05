package aoc23.day19.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day19Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(19)
        day19Part2(input) shouldBe 0
    }
})

