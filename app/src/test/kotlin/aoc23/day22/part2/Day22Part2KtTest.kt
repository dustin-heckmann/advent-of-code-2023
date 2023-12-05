package aoc23.day22.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day22Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(22)
        day22Part2(input) shouldBe 0
    }
})

