package aoc23.day06.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day06Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(6)
        day06Part1(input) shouldBe 288
    }
})
