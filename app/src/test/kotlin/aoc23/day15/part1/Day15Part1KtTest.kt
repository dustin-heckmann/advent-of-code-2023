package aoc23.day15.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day15Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(15)
        day15Part1(input) shouldBe 0
    }
})

