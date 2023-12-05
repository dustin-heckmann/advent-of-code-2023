package aoc23.day10.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day10Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(10)
        day10Part1(input) shouldBe 0
    }
})

