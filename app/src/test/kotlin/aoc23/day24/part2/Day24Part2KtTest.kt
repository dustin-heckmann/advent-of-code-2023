package aoc23.day24.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day24Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(24)
        day24Part2(input) shouldBe 0
    }
})
