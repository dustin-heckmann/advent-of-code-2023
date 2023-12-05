package aoc23.day20.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day20Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(20)
        day20Part1(input) shouldBe 0
    }
})
