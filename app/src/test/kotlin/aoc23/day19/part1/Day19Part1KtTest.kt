package aoc23.day19.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day19Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(19)
        day19Part1(input) shouldBe 0
    }
})
