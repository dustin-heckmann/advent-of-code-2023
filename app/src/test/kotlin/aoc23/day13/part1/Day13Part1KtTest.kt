package aoc23.day13.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day13Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(13)
        day13Part1(input) shouldBe 0
    }
})
