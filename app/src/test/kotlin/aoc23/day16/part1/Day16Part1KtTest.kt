package aoc23.day16.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day16Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(16)
        day16Part1(input) shouldBe 0
    }
})

