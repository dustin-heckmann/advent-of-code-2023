package aoc23.day24.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day24Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(24)
        day24Part1(input) shouldBe 0
    }
})

