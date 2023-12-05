package aoc23.day13.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day13Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(13)
        day13Part2(input) shouldBe 0
    }
})
