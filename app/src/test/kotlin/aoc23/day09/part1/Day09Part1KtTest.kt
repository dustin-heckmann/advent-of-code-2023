package aoc23.day09.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day09Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(9)
        day09Part1(input) shouldBe 0
    }
})

