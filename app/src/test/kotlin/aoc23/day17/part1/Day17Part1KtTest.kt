package aoc23.day17.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day17Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(17)
        day17Part1(input) shouldBe 0
    }
})
