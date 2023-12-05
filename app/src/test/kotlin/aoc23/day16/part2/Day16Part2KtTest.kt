package aoc23.day16.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day16Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(16)
        day16Part2(input) shouldBe 0
    }
})

