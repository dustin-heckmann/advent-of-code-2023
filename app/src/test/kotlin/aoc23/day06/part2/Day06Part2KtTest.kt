package aoc23.day06.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day06Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(6)
        day06Part2(input) shouldBe 71503
    }
})
