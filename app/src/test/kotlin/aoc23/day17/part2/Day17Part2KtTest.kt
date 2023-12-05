package aoc23.day17.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day17Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(17)
        day17Part2(input) shouldBe 0
    }
})

