package aoc23.day12.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day12Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(12)
        day12Part2(input) shouldBe 0
    }
})
